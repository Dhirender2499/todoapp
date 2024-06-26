package com.example.todoapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.model.Todo
import com.example.todoapp.repository.TodoRepository
import kotlinx.coroutines.launch

class TodoViewModel(app: Application, private val todoRepository: TodoRepository): AndroidViewModel(app){

    fun addTodo(todo: Todo) =
        viewModelScope.launch{
            todoRepository.insertTodo(todo)
        }
    fun deleteTodo(todo: Todo) =
        viewModelScope.launch{
            todoRepository.deleteTodo(todo)
        }
    fun updateTodo(todo: Todo) =
        viewModelScope.launch{
            todoRepository.updateTodo(todo)
        }
    fun getAllTodo() = todoRepository.getAllTodo()

    fun searchTodo(query: String?) =
        todoRepository.searchTodo(query)
}