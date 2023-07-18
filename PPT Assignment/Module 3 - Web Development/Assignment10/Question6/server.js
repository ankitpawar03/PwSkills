const http = require('http');

const products = {
  men: [

    {
        id: 1, 
        name: "Mens T-shirt",
        brand: "Abc",
        price: 19.99,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 2, 
        name: "Mens T-shirt",
        brand: "Polo",
        price: 199.00,
        color: "Yellow",
        size: "S",
        category: "clothing"
    },
    {
        id: 3, 
        name: "Mens Shirt",
        brand: "Roadster",
        price: 100.00,
        color: "Red",
        size: "L",
        category: "clothing"
    },
    {
        id: 4, 
        name: "Mens Jeans",
        brand: "Jokey",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 5, 
        name: "Mens T-shirt",
        brand: "Nike",
        price: 299.00,
        color: "blue",
        size: "S",
        category: "clothing"
    },
    {
        id: 6, 
        name: "Mens T-shirt",
        brand: "XYZ",
        price: 1999.0,
        color: "blue",
        size: "L",
        category: "clothing"
    },
    {
        id: 7, 
        name: "Mens Shirt",
        brand: "Abcdef",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 8, 
        name: "Mens Shirt",
        brand: "Abcde",
        price: 399.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 9, 
        name: "Mens Shirt",
        brand: "Black Boy",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 10, 
        name: "Mens Shirt",
        brand: "Abddef",
        price: 1999.00,
        color: "blue",
        size: "L",
        category: "clothing"
    },
    
  ],
  women: [
    {
        id: 1, 
        name: "Women T-shirt",
        brand: "Abc",
        price: 19.99,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 2, 
        name: "Women T-shirt",
        brand: "Polo",
        price: 199.00,
        color: "Yellow",
        size: "S",
        category: "clothing"
    },
    {
        id: 3, 
        name: "Women Shirt",
        brand: "Roadster",
        price: 100.00,
        color: "Red",
        size: "L",
        category: "clothing"
    },
    {
        id: 4, 
        name: "Women Jeans",
        brand: "Jokey",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 5, 
        name: "Women T-shirt",
        brand: "Nike",
        price: 299.00,
        color: "blue",
        size: "S",
        category: "clothing"
    },
    {
        id: 6, 
        name: "Women T-shirt",
        brand: "XYZ",
        price: 1999.0,
        color: "blue",
        size: "L",
        category: "clothing"
    },
    {
        id: 7, 
        name: "Women Shirt",
        brand: "Abcdef",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 8, 
        name: "Women Shirt",
        brand: "Abcde",
        price: 399.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 9, 
        name: "Women Shirt",
        brand: "Black Boy",
        price: 199.00,
        color: "blue",
        size: "M",
        category: "clothing"
    },
    {
        id: 10, 
        name: "Women Shirt",
        brand: "Abddef",
        price: 1999.00,
        color: "blue",
        size: "L",
        category: "clothing"
    },
  ],
};

const server = http.createServer((req, res) => {
  const { method, url } = req;

  if (url === '/') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to Men & Women Dummy Data');
  } else if (url === '/men') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(products.men));
  } else if (url === '/women') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(products.women));
  } else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Page not found');
  }
});

const port = 3000;
server.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
