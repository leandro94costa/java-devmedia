package br.com.devmedia.blog.repository;

import br.com.devmedia.blog.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
