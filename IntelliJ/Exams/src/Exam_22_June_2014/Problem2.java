   p   a   c   k   a   g   e       E   x   a   m   _   2   2   _   J   u   n   e   _   2   0   1   4   ;      
      
   i   m   p   o   r   t       j   a   v   a   .   u   t   i   l   .   S   c   a   n   n   e   r   ;      
      
   p   u   b   l   i   c       c   l   a   s   s       P   r   o   b   l   e   m   2       {      
                   p   u   b   l   i   c       s   t   a   t   i   c       v   o   i   d       m   a   i   n   (   S   t   r   i   n   g   [   ]       a   r   g   s   )   {      
                                   S   c   a   n   n   e   r       s   c   a   n       =       n   e   w       S   c   a   n   n   e   r   (   S   y   s   t   e   m   .   i   n   )   ;      
                                   S   t   r   i   n   g   [   ]       c   e   n   t   e   r       =       s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   .   s   p   l   i   t   (   "       "   )   ;      
                                   i   n   t       c   e   n   t   e   r   X       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   c   e   n   t   e   r   [   0   ]   )   ;      
                                   i   n   t       c   e   n   t   e   r   Y       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   c   e   n   t   e   r   [   1   ]   )   ;      
                                   d   o   u   b   l   e       r   a   d   i   u   s       =       D   o   u   b   l   e   .   p   a   r   s   e   D   o   u   b   l   e   (   s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   )   ;      
                                   i   n   t       d   u   r   t   s       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   )   ;      
                                   S   t   r   i   n   g   [   ]       c   o   o   r   d   s       =       s   c   a   n   .   n   e   x   t   L   i   n   e   (   )   .   s   p   l   i   t   (   "       +   "   )   ;      
                                   b   o   o   l   e   a   n       y   e   s       =       f   a   l   s   e   ;      
                                   f   o   r       (   i   n   t       i       =       0   ;   i   <   c   o   o   r   d   s   .   l   e   n   g   t   h   -   1   ;   i   +   =   2   )       {      
                                                   i   n   t       x       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   c   o   o   r   d   s   [   i   ]   )   ;      
                                                   i   n   t       y       =       I   n   t   e   g   e   r   .   p   a   r   s   e   I   n   t   (   c   o   o   r   d   s   [   i       +       1   ]   )   ;      
                                                   i   f       (   c   e   n   t   e   r   X       -       r   a   d   i   u   s       <   =       x       &   &       x       <   =       c   e   n   t   e   r   X       +       r   a   d   i   u   s   )   {      
                                                                   i   f       (   c   e   n   t   e   r   Y       -       r   a   d   i   u   s       /       2       <   =       y       &   &       y       <   =       c   e   n   t   e   r   Y       +       r   a   d   i   u   s       /       2   )   {      
                                                                                   y   e   s       =       t   r   u   e   ;      
                                                                   }      
                                                   }      
                                                   i   f   (   c   e   n   t   e   r   X       -       r   a   d   i   u   s       /       2       <   =       x       &   &       x       <   =       c   e   n   t   e   r   X       +       r   a   d   i   u   s       /       2   )   {      
                                                                   i   f   (   c   e   n   t   e   r   Y       -       r   a   d   i   u   s       <   =       y       &   &       y       <   =       c   e   n   t   e   r   Y       +       r   a   d   i   u   s   )   {      
                                                                                   y   e   s       =       t   r   u   e   ;      
                                                                   }      
                                                   }      
                                                   i   f   (   y   e   s   )       {      
                                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   y   e   s   "   )   ;      
                                                   }      
                                                   e   l   s   e   {      
                                                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "   n   o   "   )   ;      
                                                   }      
                                                   y   e   s       =       f   a   l   s   e   ;      
                                   }      
                   }      
   }      
