[
  [FunDecl,
    Idfr("fun"),
    BoolType,
    [[Idfr("x"), IntType], [Idfr("y"), IntType], [Idfr("z"), IntType]],
    [
      [IfStmt,
        [BinOpExpr,
          Eq,
          Idfr("x"),
          Idfr("y")
        ],
        [
          [BinOpExpr,
            And,
            Idfr("z"),
            [BinOpExpr,
              Eq,
              IntLit(1),
              IntLit(1)
            ]
          ]
        ],
        [
          [BinOpExpr,
            Eq,
            IntLit(1),
            IntLit(1)
          ]
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
      ],
      IntLit(1)
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