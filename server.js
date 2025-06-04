// server.js
const express = require('express');
const cors = require('cors');

const app = express();
const PORT = 8080;

app.use(cors());

app.get('/api/news', (req, res) => {
  res.json([
    {
      title: 'Breaking: React is Awesome',
      imageUrl: '',
      pubDate: new Date(),
      link: '#'
    },
    {
      title: 'Sky News Update: API Working',
      imageUrl: '',
      pubDate: new Date(),
      link: '#'
    }
  ]);
});

app.listen(PORT, () => {
  console.log(`✅ Server is running on http://localhost:${PORT}`);
});
