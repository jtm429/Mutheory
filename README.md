# Mutheory
An application for the implementation of music theory, and for the creation of midi files. This is nowhere close to finished, and does not work yet.

# Classes
this information is being added as I go, so I can remember it because I'm terribly forgetful. I also talk to myself, so my kind of enormous amount of comments can be attributed to that. Its to help me remember what the heck I'm doing with this

## MidiWriter 
The class used to handle all the weird midi stuff for me
## MidiHead
   - variables
     - file format - 2 bytes long
       - 0 is single track *(this is Default)*
       - 1 is multiple syncronous
       - 2 is multiple not-syncronous
     - number of tracks *(Default 1 track because of previous default)*
     - delta time *(Default 96 because no preference)*
       
## Chunk
## Note


