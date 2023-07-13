// export default App;
import React, { useState } from "react";

// Importing app.css is css file to add styling
import "./App.css";

const App = () => {
  // Counter is a state initialized to 0
  const [counter, setCounter] = useState(0);

  // Function is called everytime increment button is clicked
  const handleClick1 = () => {
    // Counter state is incremented
    setCounter(counter + 1);
  };

  // Function is called everytime decrement button is clicked
  const handleClick2 = () => {
    // Counter state is decremented
    setCounter(counter - 1);
  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: "center",
        fontSize: "300%",
        position: "absolute",
        width: "100%",
        height: "100vh",
      }}
    >
      <div
        style={{
          display: "flex",
          flexDirection: "column",
          alignItems: "center",
          justifyContent: "center",
          position: "absolute",
          width: "300px",
          borderRadius: "4%",
          height: "250px",
          top: "25%",
          backgroundColor: "#ff5454",
        }}
      >
        <div
          style={{
            fontSize: "120%",
            position: "relative",
            top: "0vh",
            color: "white",
            fontSize: "70%",
            fontWeight: "bold",
          }}
        >
          {counter}
        </div>
        <div className="buttons">
          <button
            style={{
              width: "100px",
              height: "50px",
              fontSize: "30%",
              top: "20vh",
              marginRight: "5px",
              backgroundColor: "white",
              borderRadius: "0%",
              color: "black",
            }}
            onClick={handleClick1}
          >
            Increment
          </button>
          <button
            style={{
              width: "100px",
              height: "50px",
              fontSize: "30%",
              top: "20vh",
              marginLeft: "15px",
              backgroundColor: "white",
              borderRadius: "0%",
              color: "black",
            }}
            onClick={handleClick2}
          >
            Decrement
          </button>
        </div>
      </div>

    </div>
  );
};

export default App;
