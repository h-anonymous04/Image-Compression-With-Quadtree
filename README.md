<p>This repository contains a Java program for image compression using the Quadtree data structure. Quadtree is a hierarchical tree data structure that is particularly useful for dividing and compressing images into smaller, more manageable pieces. This project demonstrates how to use a Quadtree to compress images efficiently.</p>

<h2>Features</h2>
<ul>
  <li>
    <strong>Image Compression: </strong> The program takes an input image and compresses it using a Quadtree data structure, reducing the image's size while preserving its essential details.
  </li>
  <li>
    <strong>Edge Detection:</strong> In addition to image compression, the program offers an edge detection feature. It can detect and highlight edges in the input image using edge detection algorithms, helping to emphasize important details in the image.
  </li>
  <li>
  <strong>Decompression: </strong> You can also decompress the compressed image to retrieve the original image.
  </li>  
  <li>
    <strong>Customizable Compression Level: </strong> You can specify the compression level to control the trade-off between image quality and compression ratio.
  </li>
</ul>
<h2>How to run?</h2>
<ol>
  <li>
    Open CMD in directory where the Main.java file is stored.
  </li>
  <li>
    Run the Main.java file.
  </li>
  <li>
    Then input image input/output path and threshold as the app tells you. 
  </li>
</ol>
<h2>Things to be considered</h2>
<ul>
  <li>As this algorithm is image details sensitive, using same threshold on different will give different compression ratio.</li>
  <li>Play around with threshold values to get best compression possible.</li>
  <li>For edge detection, play around for number of edges to render and threshold to get best possible edge detection</li>
</ul>
<hr>
<h2>Examples</h2>
<table>
  <tr>
    <th>
      Original
    </th>
    <th>
      Compressed
    </th>
  </tr>
  <tr>
    <td>
    <img height="300" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/662c0042-fa66-4443-b622-afb9ff8a602b">
      <p align="center">4.43MB</p>
    </td>
    <td>
    <img height="300" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/af632daf-9d99-4f30-89aa-0f804f327f8d">
      <p align="center">2.72MB</p>
    </td>
  </tr>
  <tr>
    <td>
    <img height="300" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/8f18b8df-1598-462d-a5c4-770e7657abb1">
      <p align="center">4.43MB</p>
    </td>
    <td>
    <img height="300" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/9ff8bdae-031f-4290-a6fa-228b9eec4e17">
      <p align="center">1.19MB</p>
    </td>
  </tr>
  <tr>
    <td>
    <img height="800" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/e207db8d-2495-4881-ae60-96202ed214be">
      <p align="center">4.43MB</p>
    </td>
    <td>
    <img height="800" width="450" src="https://github.com/h-anonymous04/Image-Compression-With-Quadtree/assets/38881836/8200adc3-c302-42e5-9b38-c77c497281ff">
      <p align="center">1.19MB</p>
    </td>
  </tr>
</table>
