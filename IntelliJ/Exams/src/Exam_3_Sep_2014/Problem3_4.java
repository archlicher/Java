   p   a   c   k   a   g   e       E   x   a   m   _   3   _   S   e   p   _   2   0   1   4   ;      
      
   i   m   p   o   r   t       j   a   v   a   .   m   a   t   h   .   B   i   g   D   e   c   i   m   a   l   ;      
   i   m   p   o   r   t       j   a   v   a   .   u   t   i   l   .   S   c   a   n   n   e   r   ;      
   i   m   p   o   r   t       j   a   v   a   .   u   t   i   l   .   T   r   e   e   M   a   p   ;      
      
   p   u   b   l   i   c       c   l   a   s   s       P   r   o   b   l   e   m   3   _   4       {      
      
                   p   r   i   v   a   t   e       s   t   a   t   i   c       i   n   t       m   o   n   t   h   N   u   m   (   S   t   r   i   n   g       s   t   r   )   {      
                                   i   n   t       a       =       0   ;      
                                   i   f   (   !   s   t   r   .   e   q   u   a   l   s   (   "   1   0   "   )   )   {      
                                                   a       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   s   t   r   )   ;      
                                                   r   e   t   u   r   n       a   ;      
                                   }      
                                   e   l   s   e       {      
                                                   r   e   t   u   r   n       a   =   1   0   ;      
                                   }      
                   }      
      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g   [   ]       a   r   g   s   )   {      
                                   S   c   a   n   n   e   r       s   c   a   n       =       n   e   w       S   c   a   n   n   e   r   (   S   y   s   t   e   m   .   i   n   )   ;      
                                   S   t   r   i   n   g       e   n   t   r   i   e   s       =       s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   ;      
                                   i   n   t       n       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   e   n   t   r   i   e   s   )   ;      
                                   T   r   e   e   M   a   p   <   S   t   r   i   n   g   ,   T   r   e   e   M   a   p   <   S   t   r   i   n   g   ,   F   l   o   a   t   >   >       a   c   t   i   v   i   t   y       =       n   e   w       T   r   e   e   M   a   p   <   S   t   r   i   n   g   ,       T   r   e   e   M   a   p   <   S   t   r   i   n   g   ,       F   l   o   a   t   >   >   (   )   ;      
                                   f   o   r   (   i   n   t       i   =   0   ;   i   <   n   ;   i   +   +   )   {      
                                                   S   t   r   i   n   g   [   ]       e   n   t   r   y       =       s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   .   s   p   l   i   t   (   "       "   )   ;      
                                                   S   t   r   i   n   g       d   a   t   e       =       e   n   t   r   y   [   0   ]   ;      
                                                   S   t   r   i   n   g       m   o   n   t   h       =       d   a   t   e   .   s   u   b   s   t   r   i   n   g   (   3   ,   5   )   ;      
                                                   S   t   r   i   n   g       n   a   m   e       =       e   n   t   r   y   [   1   ]   ;      
                                                   f   l   o   a   t       d   i   s   t   a   n   c   e       =       F   l   o   a   t   .   p   a   r   s   e   F   l   o   a   t   (   e   n   t   r   y   [   2   ]   )   ;      
                                                   i   f   (   !   a   c   t   i   v   i   t   y   .   c   o   n   t   a   i   n   s   K   e   y   (   m   o   n   t   h   )   )   {      
                                                                   a   c   t   i   v   i   t   y   .   p   u   t   (   m   o   n   t   h   ,   n   e   w       T   r   e   e   M   a   p   <   S   t   r   i   n   g   ,       F   l   o   a   t   >   (   )   )   ;      
                                                   }      
                                                   i   f   (   a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   c   o   n   t   a   i   n   s   K   e   y   (   n   a   m   e   )   )   {      
                                                                   f   l   o   a   t       d   i   s       =       a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   g   e   t   (   n   a   m   e   )   ;      
                                                                   d   i   s   +   =   d   i   s   t   a   n   c   e   ;      
                                                                   a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   p   u   t   (   n   a   m   e   ,       d   i   s   )   ;      
                                                   }      
                                                   e   l   s   e   {      
                                                                   a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   p   u   t   (   n   a   m   e   ,   d   i   s   t   a   n   c   e   )   ;      
                                                   }      
                                   }      
      
                                   f   o   r   (   S   t   r   i   n   g       m   o   n   t   h   :   a   c   t   i   v   i   t   y   .   k   e   y   S   e   t   (   )   )   {      
                                                   i   n   t       m   o   n   t   h   I   n   t       =       m   o   n   t   h   N   u   m   (   m   o   n   t   h   )   ;      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   f   (   "   %   d   :       "   ,   m   o   n   t   h   I   n   t   )   ;      
                                                   b   o   o   l   e   a   n       f   i   r   s   t       =       t   r   u   e   ;      
                                                   f   o   r   (   S   t   r   i   n   g       n   a   m   e   :   a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   k   e   y   S   e   t   (   )   )   {      
                                                                   i   f   (   !   f   i   r   s   t   )   {      
                                                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   (   "   ,       "   )   ;      
                                                                   }      
                                                                   f   i   r   s   t       =       f   a   l   s   e   ;      
                                                                   B   i   g   D   e   c   i   m   a   l       d   i   s       =   n   e   w       B   i   g   D   e   c   i   m   a   l   (   a   c   t   i   v   i   t   y   .   g   e   t   (   m   o   n   t   h   )   .   g   e   t   (   n   a   m   e   )   )   ;      
                                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   f   (   n   a   m   e   +   "   (   "   +   d   i   s   .   t   o   P   l   a   i   n   S   t   r   i   n   g   (   )   +   "   )   "   )   ;      
                                                   }      
                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   )   ;      
                                   }      
                   }      
   }      
