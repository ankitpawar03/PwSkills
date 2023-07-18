// 💡 **Q.9** You are tasked with building the backend for a Todo web application. The application allows users to create, update, and delete tasks in their to-do list with Api Endpoint as mentioned below

// **`/`** -->  send all the todos which are created by user

// **`/add`** --> to create todo create a middleware to validate user providing all the mandatory input (task), if user doesn't provide task as input send resp as validation failed

// **`/update/:id`**  --> to update todo with Todo Id, after updating send resp as {msg:"todo update successfully",data:allTodos}

// **`/delete/:id`** -->  to update todo with Todo id, after deleting send resp as {msg:"todo deleted",data:allTodos}

const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

// Sample data to store todos
let allTodos = [];

// API Endpoint to get all todos created by the user
app.get('/', (req, res) => {
  res.json(allTodos);
});

// Middleware to validate if task is provided while creating todo
const validateTask = (req, res, next) => {
  const { task } = req.body;
  if (!task) {
    return res.status(400).json({ error: 'Validation failed. Task is required.' });
  }
  next();
};

// API Endpoint to create a new todo
app.post('/add', validateTask, (req, res) => {
  const { task } = req.body;
  const newTodo = {
    id: allTodos.length + 1,
    task,
  };
  allTodos.push(newTodo);
  res.json({ msg: 'Todo created successfully', data: allTodos });
});

// API Endpoint to update a todo by ID
app.put('/update/:id', (req, res) => {
  const todoId = parseInt(req.params.id);
  const { task } = req.body;

  // Find the todo with the provided ID
  const todoToUpdate = allTodos.find((todo) => todo.id === todoId);
  if (!todoToUpdate) {
    return res.status(404).json({ error: 'Todo not found.' });
  }

  // Update the task
  todoToUpdate.task = task;

  res.json({ msg: 'Todo updated successfully', data: allTodos });
});

// API Endpoint to delete a todo by ID
app.delete('/delete/:id', (req, res) => {
  const todoId = parseInt(req.params.id);

  // Filter out the todo with the provided ID
  allTodos = allTodos.filter((todo) => todo.id !== todoId);

  res.json({ msg: 'Todo deleted', data: allTodos });
});

const PORT = 3000;
app.listen(PORT, () => console.log(`Server started on port ${PORT}`));
