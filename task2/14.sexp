[
  [FunDecl,
    Idfr("fun"),
    IntType,
    [[Idfr("x"), IntType], [Idfr("y"), IntType], [Idfr("z"), IntType]],
    [
      [IfStmt,
        Idfr("x"),
        [
          Idfr("z")
        ],
        [
          IntLit(0)
        ]
      ]
    ]
  ],
  [FunDecl,
    Idfr("main"),
    IntType,
    [],
    [
      [FunInvoc,
        Idfr("fun"),
        [
          IntLit(1),
          IntLit(2),
          IntLit(3)
        ]
      ]
    ]
  ],
  [FunDecl,
    Idfr("fun2"),
    UnitType,
    [],
    [
      Skip
    ]
  ]
]