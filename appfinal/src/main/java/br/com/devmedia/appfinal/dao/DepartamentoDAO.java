package br.com.devmedia.appfinal.dao;

import br.com.devmedia.appfinal.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DepartamentoDAO extends GenericDAO<Departamento> {

    @Autowired
    public DepartamentoDAO(DataSource dataSource) {

        super(dataSource, Departamento.class);
    }

    @Override
    public SqlParameterSource parameterSource(Departamento departamento) {

        return new BeanPropertySqlParameterSource(departamento);
    }

    @Override
    protected RowMapper<Departamento> rowMapper() {

        return new BeanPropertyRowMapper<Departamento>(Departamento.class);
    }

    public Departamento save(Departamento departamento) {

        Number key = save("DEPARTAMENTOS", "ID_DEPARTAMENTO", parameterSource(departamento));

        departamento.setIdDepartamento(key.intValue());

        return departamento;
    }

    public int update(Departamento departamento) {

        String sql = "UPDATE departamentos SET departamento = :departamento WHERE id_departamento = :idDepartamento";

        return namedQuery().update(sql, parameterSource(departamento));
    }

    public int delete(Integer id) {

        String sql = "DELETE FROM departamentos WHERE id_departamento = ?";

        return delete(sql, id);
    }

    public Departamento findById(Integer id) {

        String sql = "SELECT * FROM departamentos WHERE id_departamento = ?";

        return findById(sql, id, rowMapper());
    }

    public List<Departamento> findAll() {

        String sql = "SELECT * FROM departamentos";

        return findAll(sql, rowMapper());
    }
}
