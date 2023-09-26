package br.com.henriquebenjamim.todolistjava.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotBlank
  private String name;

  @NotBlank
  private String description;

  private boolean isDone;

  private int priority;

  public Todo(String name, String description, boolean isDone, int priority) {
    this.name = name;
    this.description = description;
    this.isDone = isDone;
    this.priority = priority;
  }
}
