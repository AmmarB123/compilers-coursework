[
  [FunDecl,
    Idfr("fun"),
    IntType,
    [[Idfr("x"), IntType], [Idfr("y"), IntType], [Idfr("z"), IntType]],
    [
      [IfStmt,
        [BinOpExpr,
          Eq,
          Idfr("x"),
          Idfr("y")
        ],
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
    [[Idfr("a"), BoolType], [Idfr("b"), IntType]],
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
