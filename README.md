# M1 - LFA

Alunos:  
Bruno Petroski Enghi  
Laís Blum  
Livia Zimermann  

## Gramática Regular

    S  → 0 a | 1 a | 2 a | 3 a | 4 a | 5 a | 6 a | 7 a | 8 a | 9 a
    a  → 0 b | 1 b | 2 b | 3 b | 4 b | 5 b | 6 b | 7 b | 8 b | 9 b
    b  → 0 c | 1 c | 2 c | 3 c | 4 c | 5 c | 6 c | 7 c | 8 c | 9 c
    c  → 0 d | 1 d | 2 d | 3 d | 4 d | 5 d | 6 d | 7 d | 8 d | 9 d
    d  → 0 e | 1 e | 2 e | 3 e | 4 e | 5 e | 6 e | 7 e | 8 e | 9 e
    e  → '.' f
    f  → 0 g | 1 g | 2 g | 3 g | 4 g | 5 g | 6 g | 7 g | 8 g | 9 g
    g  → 0 h | 1 h | 2 h | 3 h | 4 h | 5 h | 6 h | 7 h | 8 h | 9 h
    h  → 0 i | 1 i | 2 i | 3 i | 4 i | 5 i | 6 i | 7 i | 8 i | 9 i
    i  → 0 j | 1 j | 2 j | 3 j | 4 j | 5 j | 6 j | 7 j | 8 j | 9 j
    j  → 0 k | 1 k | 2 k | 3 k | 4 k | 5 k | 6 k | 7 k | 8 k | 9 k
    k  → ' ' l
    l  → 0 m | 1 m | 2 m | 3 m | 4 m | 5 m | 6 m | 7 m | 8 m | 9 m
    m  → 0 n | 1 n | 2 n | 3 n | 4 n | 5 n | 6 n | 7 n | 8 n | 9 n
    n  → 0 o | 1 o | 2 o | 3 o | 4 o | 5 o | 6 o | 7 o | 8 o | 9 o
    o  → 0 p | 1 p | 2 p | 3 p | 4 p | 5 p | 6 p | 7 p | 8 p | 9 p
    p  → 0 q | 1 q | 2 q | 3 q | 4 q | 5 q | 6 q | 7 q | 8 q | 9 q
    q  → '.' r
    r  → 0 s | 1 s | 2 s | 3 s | 4 s | 5 s | 6 s | 7 s | 8 s | 9 s
    s  → 0 t | 1 t | 2 t | 3 t | 4 t | 5 t | 6 t | 7 t | 8 t | 9 t
    t  → 0 u | 1 u | 2 u | 3 u | 4 u | 5 u | 6 u | 7 u | 8 u | 9 u
    u  → 0 v | 1 v | 2 v | 3 v | 4 v | 5 v | 6 v | 7 v | 8 v | 9 v
    v  → 0 w | 1 w | 2 w | 3 w | 4 w | 5 w | 6 w | 7 w | 8 w | 9 w
    w  → 0 x | 1 x | 2 x | 3 x | 4 x | 5 x | 6 x | 7 x | 8 x | 9 x
    x  → ' ' y
    y  → 0 z | 1 z | 2 z | 3 z | 4 z | 5 z | 6 z | 7 z | 8 z | 9 z
    z  → 0 aa | 1 aa | 2 aa | 3 aa | 4 aa | 5 aa | 6 aa | 7 aa | 8 aa | 9 aa
    aa → 0 ab | 1 ab | 2 ab | 3 ab | 4 ab | 5 ab | 6 ab | 7 ab | 8 ab | 9 ab
    ab → 0 ac | 1 ac | 2 ac | 3 ac | 4 ac | 5 ac | 6 ac | 7 ac | 8 ac | 9 ac
    ac → 0 ad | 1 ad | 2 ad | 3 ad | 4 ad | 5 ad | 6 ad | 7 ad | 8 ad | 9 ad
    ad → '.' ae
    ae → 0 af | 1 af | 2 af | 3 af | 4 af | 5 af | 6 af | 7 af | 8 af | 9 af
    af → 0 ag | 1 ag | 2 ag | 3 ag | 4 ag | 5 ag | 6 ag | 7 ag | 8 ag | 9 ag
    ag → 0 ah | 1 ah | 2 ah | 3 ah | 4 ah | 5 ah | 6 ah | 7 ah | 8 ah | 9 ah
    ah → 0 ai | 1 ai | 2 ai | 3 ai | 4 ai | 5 ai | 6 ai | 7 ai | 8 ai | 9 ai
    ai → 0 aj | 1 aj | 2 aj | 3 aj | 4 aj | 5 aj | 6 aj | 7 aj | 8 aj | 9 aj
    aj → 0 ak | 1 ak | 2 ak | 3 ak | 4 ak | 5 ak | 6 ak | 7 ak | 8 ak | 9 ak
    ak → ' ' al
    al → 0 am | 1 am | 2 am | 3 am | 4 am | 5 am | 6 am | 7 am | 8 am | 9 am
    am → ' ' na
    an → 0 ao | 1 ao | 2 ao | 3 ao | 4 ao | 5 ao | 6 ao | 7 ao | 8 ao | 9 ao
    ao → 0 ap | 1 ap | 2 ap | 3 ap | 4 ap | 5 ap | 6 ap | 7 ap | 8 ap | 9 ap
    ap → 0 aq | 1 aq | 2 aq | 3 aq | 4 aq | 5 aq | 6 aq | 7 aq | 8 aq | 9 aq
    aq → 0 ar | 1 ar | 2 ar | 3 ar | 4 ar | 5 ar | 6 ar | 7 ar | 8 ar | 9 ar
    ar → 0 as | 1 as | 2 as | 3 as | 4 as | 5 as | 6 as | 7 as | 8 as | 9 as
    as → 0 at | 1 at | 2 at | 3 at | 4 at | 5 at | 6 at | 7 at | 8 at | 9 at
    at → 0 au | 1 au | 2 au | 3 au | 4 au | 5 au | 6 au | 7 au | 8 au | 9 au
    au → 0 av | 1 av | 2 av | 3 av | 4 av | 5 av | 6 av | 7 av | 8 av | 9 av
    av → 0 aw | 1 aw | 2 aw | 3 aw | 4 aw | 5 aw | 6 aw | 7 aw | 8 aw | 9 aw
    aw → 0 ax | 1 ax | 2 ax | 3 ax | 4 ax | 5 ax | 6 ax | 7 ax | 8 ax | 9 ax
    ax → 0 ay | 1 ay | 2 ay | 3 ay | 4 ay | 5 ay | 6 ay | 7 ay | 8 ay | 9 ay
    ay → 0 az | 1 az | 2 az | 3 az | 4 az | 5 az | 6 az | 7 az | 8 az | 9 az
    az → 0 ba | 1 ba | 2 ba | 3 ba | 4 ba | 5 ba | 6 ba | 7 ba | 8 ba | 9 ba
    ba → 0 bb | 1 bb | 2 bb | 3 bb | 4 bb | 5 bb | 6 bb | 7 bb | 8 bb | 9 bb
    bb → ε

## Expressão Regular

    ^[0-9]{5}\.[0-9]{5} [0-9]{5}\.[0-9]{6} [0-9]{5}\.[0-9]{6} [0-9] [0-9]{14}$

## Tabela de Transição

| Estado | (0-9) | . | " " |
|--------|-------|---|-----|
| q0  | q1  | - | - |
| q1  | q2  | - | - |
| q2  | q3  | - | - |
| q3  | q4  | - | - |
| q4  | q5  | - | - |
| q5  | -  | q6 | - |
| q6  | q7  | - | - |
| q7  | q8  | - | - |
| q8  | q9  | - | - |
| q9  | q10 | - | - |
| q10 | q11 | - | - |
| q11 | -  | - | q12 |
| q12 | q13 | - | - |
| q13 | q14 | - | - |
| q14 | q15 | - | - |
| q15 | q16 | - | - |
| q16 | q17 | - | - |
| q17 | -  | q18| - |
| q18 | q19 | - | - |
| q19 | q20 | - | - |
| q20 | q21 | - | - |
| q21 | q22 | - | - |
| q22 | q23 | - | - |
| q23 | q24 | - | - |
| q24 | -  | - | q25 |
| q25 | q26 | - | - |
| q26 | q27 | - | - |
| q27 | q28 | - | - |
| q28 | q29 | - | - |
| q29 | q30 | - | - |
| q30 | -  | q31| - |
| q31 | q32 | - | - |
| q32 | q33 | - | - |
| q33 | q34 | - | - |
| q34 | q35 | - | - |
| q35 | q36 | - | - |
| q36 | q37 | - | - |
| q37 | -  | - | q38 |
| q38 | q39 | - | - |
| q39 | -  | - | q40 |
| q40 | q41 | - | - |
| q41 | q42 | - | - |
| q42 | q43 | - | - |
| q43 | q44 | - | - |
| q44 | q45 | - | - |
| q45 | q46 | - | - |
| q46 | q47 | - | - |
| q47 | q48 | - | - |
| q48 | q49 | - | - |
| q49 | q50 | - | - |
| q50 | q51 | - | - |
| q51 | q52 | - | - |
| q52 | q53 | - | - |
| q53 | q54 | - | - |
| q54 | -  | - | - |

