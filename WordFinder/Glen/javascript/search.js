//execute using:
// node search.js

console.log('in my search');

function wordSearch(p1, p2) {
  var found = false;
  //search rows
  for (var i = 0; i < p1.length && found == false; i++) {
    if (p1[i].join("") == p2) found = true;
  }
  //search cols
  for (var i = 0; i < p1[0].length && found == false; i++) {
    var word = '';
    for (var j = 0; j < p1[0].length; j++) {
      word += p1[j][i];
    }
    if (word == p2) found = true;
  }
  return found;
}
	
var matrix = [['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']];
console.log(matrix);

var targetWord = [ 'FOAM', 'FACI', 'XXXX', 'MASS', 'IPBS' ];
for (i = 0; i < targetWord.length; i++) {
  console.log('is ' + targetWord[i] + ' in matrix? ' + wordSearch(matrix,targetWord[i]));
}
console.log('finished');






