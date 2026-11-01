.class public Ll/ܿ᩺ۘ;
.super Landroid/app/Service;
.source "F5X0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static ۛ:Ljava/lang/String; = ""

.field public static ۫:Ljava/lang/String;

.field public static ܿ:Ll/ۛۨۨ;

.field private static final ᩶ܽۛ:[S


# instance fields
.field public ֡:Ll/᩶ۜ᩺;

.field public ܺ:Ll/ۛۨۨ;

.field public final ܽ:Landroid/content/BroadcastReceiver;

.field public ᩶:Ll/۫᩺ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    return-void

    :array_0
    .array-data 2
        0x9a4s
        -0x44f9s
        -0x44ecs
        -0x44ebs
        -0x44fbs
        -0x238es
        -0x2a34s
        -0x28ffs
        0x335es
        0x3c8fs
        0x34c4s
        -0x44d9s
        -0x44dbs
        -0x44ces
        -0x44d1s
        -0x44d7s
        -0x44d8s
        -0x44c7s
        -0x44d5s
        -0x44ces
        -0x44c7s
        -0x44dbs
        -0x44d6s
        -0x44d7s
        -0x44cbs
        -0x44dds
        -0x44c7s
        -0x44ccs
        -0x44dds
        -0x44cbs
        -0x44d7s
        -0x44cds
        -0x44ccs
        -0x44dbs
        -0x44dds
        -0x44c7s
        -0x44c9s
        -0x44cds
        -0x44dds
        -0x44ccs
        -0x44d1s
        -0x44dds
        -0x44ccs
        0x18das
        -0x7b9es
        -0x7b9bs
        -0x7b9es
        -0x7b81s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x5121993

    sget v2, Ll/ۧ;->֫۠ᩴ:I

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    .line 20
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7f45

    const v6, -0x45950678

    xor-int/2addr v5, v6

    const v6, -0x253a9d0c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x66e7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 92
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_5

    goto/16 :goto_4

    .line 105
    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4719

    const v6, -0x404f0014

    xor-int/2addr v5, v6

    const v6, -0x7689710f

    goto :goto_0

    :sswitch_1
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_7

    goto/16 :goto_4

    .line 97
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 82
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    goto/16 :goto_3

    .line 24
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 120
    :sswitch_5
    iput-object v0, p0, Ll/ܿ᩺ۘ;->ܽ:Landroid/content/BroadcastReceiver;

    return-void

    .line 47
    :sswitch_6
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a7a\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6d91

    const v6, 0x43153e2b

    xor-int/2addr v5, v6

    const v6, 0x70ea99d2

    goto :goto_0

    .line 69
    :sswitch_7
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06e8\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xeff

    const v6, 0xf3be252

    xor-int/2addr v5, v6

    const v6, -0x6d7d4a5f

    goto/16 :goto_0

    .line 50
    :sswitch_8
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u073d\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4dd9

    const v6, 0x3e05390f

    xor-int/2addr v5, v6

    const v6, -0x7aaa9774

    goto/16 :goto_0

    .line 76
    :sswitch_9
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u073f\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2df9

    const v6, 0x2f16d089

    xor-int/2addr v5, v6

    const v6, 0x1592fcbd

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e7\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x93d

    const v6, -0x1a702407

    xor-int/2addr v5, v6

    const v6, 0x4d085a18    # 1.4297536E8f

    goto/16 :goto_0

    .line 57
    :sswitch_a
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x19e1

    const v6, 0x1d8d9d19

    xor-int/2addr v5, v6

    const v6, 0x60f9e971

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u1a78\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6db9

    const v6, -0x4b6e1dc2

    xor-int/2addr v5, v6

    const v6, -0x7dcb18e9

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d7\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x379f

    const v6, 0x470d003f

    xor-int/2addr v5, v6

    const v6, -0x45adfd7b

    goto/16 :goto_0

    .line 113
    :sswitch_c
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u1a79\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x79d5

    const v6, -0x325054ea

    xor-int/2addr v5, v6

    const v6, 0xfb979c9

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e1\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4b43

    const v6, -0x53e0137f

    xor-int/2addr v5, v6

    const v6, -0xb10b8ec

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v4

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06e7\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x10cd

    const v6, 0x13938051

    xor-int/2addr v5, v6

    const v6, -0x5a6a131

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u05ab\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x469d

    const v6, 0x221eca

    xor-int/2addr v5, v6

    const v6, 0x4fe1efe6

    goto/16 :goto_0

    .line 120
    :sswitch_e
    new-instance v0, Ll/ܽ᩺ۘ;

    invoke-direct {v0, p0}, Ll/ܽ᩺ۘ;-><init>(Ll/ܿ᩺ۘ;)V

    .line 82
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a77\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1d1d

    const v6, 0xc4af32f

    xor-int/2addr v5, v6

    const v6, -0x354db7f6    # -5841925.0f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a13

    const v6, -0x6b6c3cdc

    xor-int/2addr v5, v6

    const v6, -0x2fc9e2a3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7711303a -> :sswitch_b
        -0x726828ba -> :sswitch_1
        -0x600f5e13 -> :sswitch_c
        -0x5c587d16 -> :sswitch_3
        -0x566bb3a4 -> :sswitch_2
        -0x5569185f -> :sswitch_8
        -0x4a5cc4d9 -> :sswitch_7
        -0x3dd6fcfa -> :sswitch_e
        -0x32168b76 -> :sswitch_9
        -0x3012a1e8 -> :sswitch_5
        -0x1da075d2 -> :sswitch_c
        -0x1ae0bc83 -> :sswitch_0
        -0x18de36e2 -> :sswitch_0
        0x2b0c43b -> :sswitch_e
        0x3aab1b1 -> :sswitch_8
        0x52c6473 -> :sswitch_6
        0xa4289aa -> :sswitch_2
        0x1dc0041b -> :sswitch_a
        0x1ed8414c -> :sswitch_1
        0x25ebd098 -> :sswitch_6
        0x2c647754 -> :sswitch_5
        0x42e0b11d -> :sswitch_b
        0x44dfc699 -> :sswitch_a
        0x44ea928d -> :sswitch_9
        0x4962601a -> :sswitch_d
        0x4e25d6e9 -> :sswitch_4
        0x6df7a343 -> :sswitch_4
        0x6f321146 -> :sswitch_d
        0x75b58f20 -> :sswitch_3
        0x77ca4468 -> :sswitch_7
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ܿ᩺ۘ;)Ll/ۛۨۨ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩺ۘ;->ܺ:Ll/ۛۨۨ;

    return-object p0
.end method

.method public static bridge synthetic ܰ(Ll/ܿ᩺ۘ;)Ll/᩶ۜ᩺;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    return-object p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 48
    iget-object p1, p0, Ll/ܿ᩺ۘ;->᩶:Ll/۫᩺ۘ;

    return-object p1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x75951e9b

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v5, "\u06eb\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x24af

    const v7, 0x108b824e

    xor-int/2addr v6, v7

    const v7, 0x1f66f878

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x5517

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 5
    sget v5, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v5, :cond_4

    goto/16 :goto_5

    .line 55
    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v5

    if-eqz v5, :cond_d

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    sget v5, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v5, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_8

    goto/16 :goto_3

    .line 48
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    return-void

    .line 114
    :sswitch_5
    sput-object p1, Ll/ܿ᩺ۘ;->ۛ:Ljava/lang/String;

    goto/16 :goto_2

    :sswitch_6
    const/16 v5, 0xd

    .line 113
    invoke-static {p1, v5}, Ll/ۗܺ;->᩻᩷ܶ(Ljava/lang/Object;I)I

    move-result v5

    if-ne v5, v1, :cond_3

    const-string v5, "\u06eb\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4669

    const v8, 0x3ac3e40f

    xor-int/2addr v6, v8

    const v8, -0x41366453

    goto/16 :goto_7

    :sswitch_7
    const/16 v1, 0xa

    .line 112
    invoke-static {p1, v1}, Ll/ۗܺ;->᩻᩷ܶ(Ljava/lang/Object;I)I

    move-result v1

    const/4 v5, -0x1

    if-ne v1, v5, :cond_0

    const-string v1, "\u06eb\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v4

    mul-int/lit8 v1, v1, 0x21

    xor-int v6, v1, v3

    mul-int/lit16 v6, v6, 0x59a9

    const v8, 0x1245fd09

    xor-int/2addr v6, v8

    const v8, -0x41a1b24c

    xor-int/2addr v1, v8

    move v5, v1

    const/4 v1, -0x1

    goto :goto_1

    :cond_0
    const/4 v1, -0x1

    goto :goto_2

    .line 111
    :sswitch_8
    invoke-static {p1}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v5

    const/16 v6, 0x64

    if-ge v5, v6, :cond_3

    const-string v5, "\u06d9\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xc13

    const v8, -0x726705d0

    xor-int/2addr v6, v8

    const v8, 0x2abd8797

    goto/16 :goto_7

    :sswitch_9
    const/high16 p1, 0x10000000

    .line 116
    invoke-static {v7, p1}, Ll/ۗ;->ۜܳ᩵(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 117
    invoke-static {p0, v7}, Ll/ۖۧ;->ܳۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 115
    :sswitch_a
    new-instance v7, Landroid/content/Intent;

    const-class v5, Ll/ۛ᩺ۘ;

    sget v6, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-direct {v7, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u05a8\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5c9

    const v8, -0x1d68302a

    xor-int/2addr v6, v8

    const v8, -0x7e333d54

    goto/16 :goto_7

    .line 110
    :sswitch_b
    invoke-static {}, Ll/۫ܶۘ;->᩻()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v5, "\u06eb\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x51

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7093

    const v8, 0x5951aac8

    xor-int/2addr v6, v8

    const v8, -0x7379e8ea

    goto/16 :goto_7

    :cond_3
    :goto_2
    const-string v5, "\u1a79\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x65b1

    const v8, -0x4e8266e

    xor-int/2addr v6, v8

    const v8, 0x7105c30f

    goto/16 :goto_7

    :cond_4
    const-string v5, "\u05a1\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1149

    const v8, 0x6c2e0fee

    xor-int/2addr v6, v8

    const v8, -0x1a24ffd6

    goto/16 :goto_7

    .line 109
    :sswitch_c
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v5, "\u1a75\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xd4f

    const v8, -0x2e219a16

    xor-int/2addr v6, v8

    const v8, 0x4e6a5ea3    # 9.8301766E8f

    goto/16 :goto_7

    .line 91
    :sswitch_d
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v5, :cond_6

    :goto_3
    const-string v5, "\u1a73\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x750b

    const v7, -0x47e19e8a

    xor-int/2addr v6, v7

    const v7, -0x112b1228

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a7b\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x606b

    const v8, 0x38021112

    xor-int/2addr v6, v8

    const v8, -0x88da61e

    goto/16 :goto_7

    .line 90
    :sswitch_e
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v5

    if-gtz v5, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u06d9\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x49b9

    const v8, -0x2dd13564

    xor-int/2addr v6, v8

    const v8, 0x51eb8ef3

    goto/16 :goto_7

    :sswitch_f
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v5

    if-gtz v5, :cond_9

    :cond_8
    const-string v5, "\u073f\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1337

    const v8, 0x4f241f30

    xor-int/2addr v6, v8

    const v8, -0x7ec9cc41

    goto/16 :goto_7

    :cond_9
    const-string v5, "\u06db\u1a7b"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x739d

    const v8, -0x6d752cce

    xor-int/2addr v6, v8

    const v8, 0x5185edee

    goto/16 :goto_7

    .line 40
    :sswitch_10
    sget v5, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v5, :cond_a

    :goto_4
    const-string v5, "\u06df\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7847

    const v8, 0x776eda95

    xor-int/2addr v6, v8

    const v8, 0x34e61e60

    goto :goto_7

    :cond_a
    const-string v5, "\u0730\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6535

    const v8, 0x5b03c812

    xor-int/2addr v6, v8

    const v8, 0x2a0a1d3f

    goto :goto_7

    .line 74
    :sswitch_11
    sget-boolean v5, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u1a77\u06eb"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7e73

    const v8, 0x5bae1cf9

    xor-int/2addr v6, v8

    const v8, 0x7efde501

    goto :goto_7

    :cond_c
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5423

    const v8, -0x5a4a03c

    xor-int/2addr v6, v8

    const v8, 0x41883cfa

    goto :goto_7

    :sswitch_12
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_e

    :cond_d
    :goto_6
    const-string v5, "\u073a\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v3

    mul-int/lit8 v6, v6, 0x7

    const v8, 0x60de450d

    xor-int/2addr v6, v8

    const v8, 0x69a0ac57

    goto :goto_7

    :cond_e
    const-string v5, "\u073f\u06e8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x337f

    const v8, 0x43fb78ad

    xor-int/2addr v6, v8

    const v8, -0x135728f0

    :goto_7
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7b9417c8 -> :sswitch_e
        -0x6bce535f -> :sswitch_9
        -0x6abd54c8 -> :sswitch_2
        -0x691a3c37 -> :sswitch_7
        -0x654506c0 -> :sswitch_a
        -0x618bf5c8 -> :sswitch_5
        -0x58f6a2ff -> :sswitch_3
        -0x57d218a5 -> :sswitch_e
        -0x3e497220 -> :sswitch_f
        -0x3c70b61b -> :sswitch_a
        -0x3c6290aa -> :sswitch_8
        -0x3c2834c0 -> :sswitch_1
        -0x3b7c8549 -> :sswitch_8
        -0x36540765 -> :sswitch_0
        -0x24eb1c98 -> :sswitch_0
        -0x205e3050 -> :sswitch_6
        -0x1cc9f164 -> :sswitch_2
        -0x14726ad1 -> :sswitch_f
        -0xffe0ff2 -> :sswitch_9
        0xe67c160 -> :sswitch_b
        0x2266342c -> :sswitch_11
        0x2db69515 -> :sswitch_6
        0x2fbe1dc7 -> :sswitch_12
        0x3946da4f -> :sswitch_11
        0x3ad91bfe -> :sswitch_c
        0x3b393dd6 -> :sswitch_4
        0x3e0e0672 -> :sswitch_d
        0x3f5c6fc2 -> :sswitch_c
        0x557532dd -> :sswitch_5
        0x581a05f2 -> :sswitch_b
        0x5cd4c347 -> :sswitch_10
        0x5daff89a -> :sswitch_d
        0x6a8aa105 -> :sswitch_3
        0x6f840f1b -> :sswitch_1
        0x73c06de1 -> :sswitch_7
        0x79ef9522 -> :sswitch_10
        0x7d3f06e1 -> :sswitch_4
        0x7f3a61c3 -> :sswitch_12
    .end sparse-switch
.end method

.method public final onCreate()V
    .locals 25

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x781a70c4

    sget v18, Ll/֡۠;->ۛ᩻ۧ:I

    sget v19, Ll/֫;->ܶܺ᩻:I

    const-string v20, "\u06dc\u06dc"

    invoke-static/range {v20 .. v20}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    xor-int v1, v20, v19

    mul-int/lit16 v1, v1, 0x76df

    const v22, -0x410e4ac7

    xor-int v1, v1, v22

    const v22, -0x2b56c6e8

    xor-int v20, v20, v22

    move-object v3, v2

    move-object/from16 v23, v9

    move-object v13, v12

    move-object v15, v14

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const v20, -0x781a70c4

    const/16 v22, 0x0

    :goto_0
    xor-int v10, v20, v19

    mul-int/lit16 v10, v10, -0x3ac3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    move/from16 v21, v6

    move-object/from16 v1, v23

    const v6, 0xbb66

    const v9, 0xbb66

    goto/16 :goto_9

    .line 59
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v1

    if-gez v1, :cond_0

    :goto_1
    move/from16 v21, v6

    :goto_2
    move-object/from16 v1, v23

    goto/16 :goto_6

    :cond_0
    move/from16 v21, v6

    :goto_3
    move-object/from16 v1, v23

    goto/16 :goto_7

    .line 57
    :sswitch_1
    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v1, :cond_4

    goto :goto_1

    .line 28
    :sswitch_2
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v21, v6

    goto/16 :goto_a

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    goto :goto_1

    .line 20
    :sswitch_4
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    return-void

    .line 41
    :sswitch_5
    iget-object v1, v0, Ll/ܿ᩺ۘ;->ܽ:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v8}, Ll/ܽܺۘ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 42
    new-instance v1, Ll/۫᩺ۘ;

    invoke-direct {v1, v0}, Ll/۫᩺ۘ;-><init>(Ll/ܿ᩺ۘ;)V

    iput-object v1, v0, Ll/ܿ᩺ۘ;->᩶:Ll/۫᩺ۘ;

    return-void

    :sswitch_6
    const v1, 0x7d1a5fb3

    xor-int/2addr v1, v6

    .line 39
    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 41
    new-instance v8, Landroid/content/IntentFilter;

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_2

    goto :goto_4

    :cond_2
    sget-object v1, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    const/16 v10, 0xb

    move/from16 v21, v6

    const/16 v6, 0x20

    invoke-static {v1, v10, v6, v9}, Ll/֨᩺;->ۧۖܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_3

    :cond_3
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x6d

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0xe73

    const v10, -0x3b528488

    xor-int/2addr v6, v10

    const v10, -0x736054ef

    goto/16 :goto_8

    .line 38
    :sswitch_7
    invoke-static {v15, v4, v7, v9}, Ll/֨֫;->ܺᩴܳ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    .line 12
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    :goto_4
    const-string v1, "\u06eb\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit16 v8, v8, -0x1d97

    const v10, -0xbb31e17

    xor-int/2addr v8, v10

    const v10, 0x38cc3f7c

    xor-int v21, v1, v10

    move v1, v8

    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u1a76\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x51

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x62a7

    const v21, -0x7c884119

    xor-int v10, v10, v21

    const v21, 0x7b55e38c

    xor-int v21, v1, v21

    move v1, v10

    goto/16 :goto_0

    :sswitch_8
    move/from16 v21, v6

    .line 38
    iput-object v2, v0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    sget-object v15, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    const/16 v4, 0x8

    const/4 v7, 0x3

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v1, "\u06df\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x45

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x48f1

    const v10, -0x3962ac69

    xor-int/2addr v6, v10

    const v10, 0xeb39fe0

    goto/16 :goto_8

    :sswitch_9
    move/from16 v21, v6

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-static {v3, v5, v1}, Ll/᩶֫ܰ;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩶֫ܰ;

    move-result-object v1

    .line 99
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    invoke-static {v2, v0}, Ll/֫ܽ;->᩸᩷ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x13

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x55eb

    const v10, -0x62d90410

    xor-int/2addr v6, v10

    const v10, -0x48a352da

    goto/16 :goto_8

    :sswitch_a
    move/from16 v21, v6

    const/4 v1, 0x3

    .line 37
    invoke-static {v13, v14, v1, v9}, Ll/֨᩸;->۫ۜܽ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7e98c44c

    xor-int/2addr v5, v1

    .line 19
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v1

    if-ltz v1, :cond_8

    :goto_5
    const-string v1, "\u1a74\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x23

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x1fa9

    const v10, -0x41325bf3

    xor-int/2addr v6, v10

    const v10, -0x6f6ddf0f

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x7bf7

    const v10, 0x1993a337

    xor-int/2addr v6, v10

    const v10, 0x3891d297

    goto/16 :goto_8

    :sswitch_b
    move/from16 v21, v6

    move-object/from16 v1, v23

    .line 34
    invoke-static {v1, v11, v12, v9}, Ll/֫ܽ;->ᩴ᩸ۗ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-static {v0, v2}, Ll/᩶ۜ᩺;->ۙ(Landroid/app/Service;Ljava/lang/String;)Ll/᩶ۜ᩺;

    move-result-object v2

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget-object v13, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    const/4 v14, 0x5

    .line 79
    sget v6, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v6, :cond_9

    :goto_6
    const-string v6, "\u06e2\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, 0x3a05

    const v23, 0x63f79f4a

    xor-int v10, v10, v23

    const v23, -0x2d4eea22

    goto/16 :goto_b

    :cond_9
    const-string v6, "\u0730\u05a1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v19, v6

    mul-int/lit8 v6, v6, 0x65

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x3de3

    const v23, -0xd5b76c2

    xor-int v10, v10, v23

    const v23, 0x5e4a8a0f

    goto/16 :goto_b

    :sswitch_c
    move/from16 v21, v6

    move-object/from16 v1, v23

    const/4 v11, 0x1

    const/4 v12, 0x4

    sget-boolean v6, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v6, :cond_a

    :goto_7
    const-string v6, "\u0730\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, 0x5517

    const v23, -0x49801e77

    xor-int v10, v10, v23

    const v23, -0x70cbd447

    goto/16 :goto_b

    :cond_a
    const-string v6, "\u1a77\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, 0x58f3

    const v23, 0x44edc75d

    xor-int v10, v10, v23

    const v23, 0x592e6440

    goto/16 :goto_b

    :sswitch_d
    move/from16 v21, v6

    .line 33
    invoke-super/range {p0 .. p0}, Landroid/app/Service;->onCreate()V

    .line 34
    invoke-static {}, Ll/ۖܿۘ;->ۜۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->setTheme(I)V

    sget-object v23, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    .line 58
    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v1, :cond_b

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u06da\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x77

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x63b5

    const v10, -0x7e4a1e9b

    xor-int/2addr v6, v10

    const v10, -0xe3cd92a

    :goto_8
    xor-int/2addr v1, v10

    move/from16 v24, v21

    move/from16 v21, v1

    move v1, v6

    goto/16 :goto_c

    :sswitch_e
    move/from16 v21, v6

    move-object/from16 v1, v23

    const/16 v6, 0x4d81

    const/16 v9, 0x4d81

    :goto_9
    const-string v6, "\u06df\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v19, v6

    mul-int/lit8 v6, v6, 0x4f

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x6f47

    const v23, 0x20988533

    xor-int v10, v10, v23

    const v23, 0x2f0ca7a9

    goto/16 :goto_b

    :sswitch_f
    move/from16 v21, v6

    move-object/from16 v1, v23

    mul-int v6, v17, v22

    mul-int v10, v17, v17

    const v23, 0x1950400

    add-int v10, v10, v23

    sub-int/2addr v6, v10

    if-lez v6, :cond_c

    const-string v6, "\u1a78\u06e2"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, 0x2d99

    const v23, 0x775ffa1d

    xor-int v10, v10, v23

    const v23, 0x51f4c50d

    goto :goto_b

    :cond_c
    const-string v6, "\u06e1\u06e8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    mul-int/lit8 v6, v6, -0x71

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x125

    const v23, -0x35f170e1

    xor-int v10, v10, v23

    const v23, 0x6bade7fc

    goto :goto_b

    :sswitch_10
    move/from16 v21, v6

    move-object/from16 v1, v23

    sget-object v6, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    const/4 v10, 0x0

    aget-short v17, v6, v10

    const/16 v22, 0x2840

    sget-boolean v6, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v6, :cond_d

    move-object/from16 v23, v1

    :goto_a
    const-string v1, "\u06ec\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x5137

    const v10, 0x63d36d49

    xor-int/2addr v6, v10

    const v10, -0x730d3c38

    goto/16 :goto_8

    :cond_d
    const-string v6, "\u05a8\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, -0x25a1

    const v23, -0x6d9b3a4c

    xor-int v10, v10, v23

    const v23, 0x15238593

    :goto_b
    xor-int v6, v6, v23

    move-object/from16 v23, v1

    move v1, v10

    move/from16 v24, v21

    move/from16 v21, v6

    :goto_c
    move/from16 v6, v24

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x782dd371 -> :sswitch_f
        -0x7308d816 -> :sswitch_0
        -0x6e7ae282 -> :sswitch_3
        -0x6dbc2e6c -> :sswitch_1
        -0x6cff53d2 -> :sswitch_9
        -0x6c1c02c9 -> :sswitch_3
        -0x5d3dd5ca -> :sswitch_a
        -0x5ae0e62e -> :sswitch_8
        -0x5779db40 -> :sswitch_6
        -0x4e61b0d3 -> :sswitch_8
        -0x47f66f0d -> :sswitch_4
        -0x42c450d5 -> :sswitch_b
        -0x36211e01 -> :sswitch_10
        -0x27ce1813 -> :sswitch_d
        -0x2325b5dd -> :sswitch_2
        -0x1ffde152 -> :sswitch_a
        -0x1ce32210 -> :sswitch_1
        -0xa77b8ce -> :sswitch_2
        -0x194c91f -> :sswitch_7
        0x92e839 -> :sswitch_5
        0x854307a -> :sswitch_f
        0x25e664a6 -> :sswitch_9
        0x349a0bd4 -> :sswitch_6
        0x36a74cf9 -> :sswitch_4
        0x437ba659 -> :sswitch_c
        0x4c80fd00 -> :sswitch_e
        0x4da3cd3c -> :sswitch_d
        0x545e6b12 -> :sswitch_b
        0x55a20acf -> :sswitch_7
        0x57c0fb71 -> :sswitch_c
        0x5c8244de -> :sswitch_e
        0x68db5943 -> :sswitch_0
        0x6bfccb49 -> :sswitch_10
        0x7296b047 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x40c14d44

    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v4, "\u06e7\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x747b

    const v6, 0x5960c51a

    xor-int/2addr v5, v6

    const v6, -0x38fe7039

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x6feb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 94
    sput-object v0, Ll/ܿ᩺ۘ;->۫:Ljava/lang/String;

    .line 54
    sget v4, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v4, :cond_2

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_9

    goto :goto_1

    .line 63
    :sswitch_2
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u073f\u1a74"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4803

    const v6, -0x3bbc880e

    xor-int/2addr v5, v6

    const v6, 0x5c83b10e

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    :goto_2
    const-string v4, "\u06d8\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x503f

    const v6, 0x3812be86

    xor-int/2addr v5, v6

    const v6, 0x3770a633

    goto :goto_0

    .line 76
    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    return-void

    .line 96
    :sswitch_5
    iget-object v0, p0, Ll/ܿ᩺ۘ;->ܽ:Landroid/content/BroadcastReceiver;

    invoke-static {v0}, Ll/ܽܺۘ;->ۙ(Landroid/content/BroadcastReceiver;)V

    return-void

    .line 95
    :sswitch_6
    iget-object v4, p0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    invoke-virtual {v4}, Ll/᩶ۜ᩺;->ۨ()V

    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u073a\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7223

    const v6, -0x3ba7980d

    xor-int/2addr v5, v6

    const v6, -0x75799f23

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u1a77\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1db1

    const v6, 0xf079a30

    xor-int/2addr v5, v6

    const v6, -0x721e46d0

    goto/16 :goto_0

    :sswitch_7
    const/4 v0, 0x0

    .line 70
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1737

    const v6, 0x5510d118

    xor-int/2addr v5, v6

    const v6, 0xae9a586

    goto/16 :goto_0

    .line 29
    :sswitch_8
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06d7\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7693

    const v6, -0x653f37ea

    xor-int/2addr v5, v6

    const v6, 0x5e7b5320

    goto/16 :goto_0

    .line 46
    :sswitch_9
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u1a75\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3d33

    const v6, 0x445aeae

    xor-int/2addr v5, v6

    const v6, -0x12b0ee9

    goto/16 :goto_0

    .line 42
    :sswitch_a
    sget v4, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06db\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a43

    const v6, 0x330d460d

    xor-int/2addr v5, v6

    const v6, -0x6e961e7a

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u1a77\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2a59

    const v6, -0x262535c

    xor-int/2addr v5, v6

    const v6, -0x63d10d67

    goto/16 :goto_0

    .line 8
    :sswitch_c
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_8

    :goto_3
    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f8d

    const v6, 0x6cf855a6

    xor-int/2addr v5, v6

    const v6, 0x52b40936

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e4\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4723

    const v6, 0x346bc0ac

    xor-int/2addr v5, v6

    const v6, -0x780fd73c

    goto/16 :goto_0

    .line 13
    :sswitch_d
    sget v4, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06df\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x53dd

    const v6, -0x2eecb70b

    xor-int/2addr v5, v6

    const v6, -0x6ee9ea7e

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d7\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5e6d

    const v6, -0x5e84699b

    xor-int/2addr v5, v6

    const v6, -0x1d218fc9

    goto/16 :goto_0

    .line 93
    :sswitch_e
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 60
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a73\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x403d

    const v6, 0x7a16d462

    xor-int/2addr v5, v6

    const v6, -0x61b90fc9

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x768b

    const v6, -0x123461f6

    xor-int/2addr v5, v6

    const v6, 0x4386a161

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f8e4840 -> :sswitch_9
        -0x718e39af -> :sswitch_7
        -0x6ae866a1 -> :sswitch_a
        -0x5ef0df80 -> :sswitch_d
        -0x594a82c6 -> :sswitch_8
        -0x571c9673 -> :sswitch_c
        -0x53289349 -> :sswitch_7
        -0x51e18059 -> :sswitch_6
        -0x4543e3ad -> :sswitch_c
        -0x4183047e -> :sswitch_1
        -0x33a681c4 -> :sswitch_a
        -0x2a7da3c9 -> :sswitch_1
        -0x2a784029 -> :sswitch_6
        -0x24af4b78 -> :sswitch_9
        -0x230e7d1e -> :sswitch_4
        -0x206d900c -> :sswitch_b
        -0x1a5784b2 -> :sswitch_e
        -0x7b2cf36 -> :sswitch_2
        -0x731eee -> :sswitch_2
        0x2d7bf -> :sswitch_b
        0x2e15d58 -> :sswitch_3
        0x926b875 -> :sswitch_5
        0xad1e9a6 -> :sswitch_0
        0x1e8c16f9 -> :sswitch_5
        0x3b0c54cb -> :sswitch_0
        0x42311922 -> :sswitch_8
        0x4a853d1d -> :sswitch_d
        0x59631d32 -> :sswitch_e
        0x78228a12 -> :sswitch_4
        0x7c79888b -> :sswitch_3
    .end sparse-switch
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x7de0828e

    sget v13, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v14, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v15, "\u05a1\u06e4"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, 0x1fbd

    const v16, 0x568cb2cb

    xor-int v2, v2, v16

    const v16, 0x61463ec1

    xor-int v15, v15, v16

    move-object v10, v9

    move/from16 v16, v15

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x7de0828e

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x6ce9

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    .line 86
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v2

    if-lez v2, :cond_2

    :goto_1
    move/from16 p2, v15

    goto/16 :goto_a

    .line 20
    :sswitch_0
    sget-boolean v2, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v2, :cond_1

    :cond_0
    move/from16 p2, v15

    goto/16 :goto_9

    :cond_1
    move/from16 p2, v15

    goto/16 :goto_8

    :cond_2
    move/from16 p2, v15

    goto/16 :goto_7

    .line 96
    :sswitch_1
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    const/4 v1, 0x0

    return v1

    .line 101
    :sswitch_4
    iget-object v2, v0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    invoke-virtual {v2}, Ll/᩶ۜ᩺;->show()V

    goto :goto_2

    .line 103
    :sswitch_5
    iget-object v2, v0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    invoke-virtual {v2}, Ll/᩶ۜ᩺;->ۙ()V

    :goto_2
    move/from16 p2, v15

    goto :goto_3

    :sswitch_6
    const/4 v1, 0x2

    return v1

    .line 81
    :sswitch_7
    sget-object v2, Ll/ܿ᩺ۘ;->ܿ:Ll/ۛۨۨ;

    iput-object v2, v0, Ll/ܿ᩺ۘ;->ܺ:Ll/ۛۨۨ;

    const/4 v2, 0x0

    .line 82
    sput-object v2, Ll/ܿ᩺ۘ;->ܿ:Ll/ۛۨۨ;

    move/from16 p2, v15

    goto/16 :goto_4

    .line 100
    :sswitch_8
    iget-object v2, v0, Ll/ܿ᩺ۘ;->֡:Ll/᩶ۜ᩺;

    invoke-virtual {v2}, Ll/᩶ۜ᩺;->ܰ()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "\u06d6\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    move/from16 p2, v15

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x6c5

    const v16, -0x394e26d3

    xor-int v15, v15, v16

    const v16, -0x191deb13

    goto/16 :goto_b

    :cond_3
    move/from16 p2, v15

    const-string v2, "\u05a8\u1a7b"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x330b

    const v16, -0x30e4f84e    # -2.6009728E9f

    xor-int v15, v15, v16

    const v16, 0x66e1b3e2

    goto/16 :goto_b

    :sswitch_9
    move/from16 p2, v15

    .line 87
    invoke-virtual/range {p0 .. p0}, Landroid/app/Service;->stopSelf()V

    :goto_3
    const-string v2, "\u06e2\u073d"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x7d3d

    const v16, -0x56209ba7

    xor-int v15, v15, v16

    const v16, -0x8c659a

    goto/16 :goto_b

    :sswitch_a
    move/from16 p2, v15

    .line 0
    invoke-static {v10, v11, v12, v9}, Ll/֡ܳ;->ܶۘۙ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v15, 0x0

    .line 80
    invoke-virtual {v1, v2, v15}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "\u06d9\u06e1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x32b3

    const v16, 0x273f79a7

    xor-int v15, v15, v16

    const v16, -0x3ced1e37

    goto/16 :goto_b

    :sswitch_b
    move/from16 p2, v15

    .line 0
    sget-object v10, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    const/16 v11, 0x2c

    const/4 v12, 0x4

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_a

    :cond_4
    const-string v2, "\u073f\u1a79"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x4fa7

    const v16, -0x22e868ff    # -6.827E17f

    xor-int v15, v15, v16

    const v16, 0x7f5b795f

    goto/16 :goto_b

    :sswitch_c
    move/from16 p2, v15

    .line 84
    iget-object v2, v0, Ll/ܿ᩺ۘ;->ܺ:Ll/ۛۨۨ;

    if-eqz v2, :cond_5

    const-string v2, "\u06eb\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x47

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x31f

    const v16, -0x464f2c16

    xor-int v15, v15, v16

    const v16, -0x3c9dca36

    goto/16 :goto_b

    :cond_5
    const-string v2, "\u1a73\u1a79"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x49df

    const v16, 0x475bd06b

    xor-int v15, v15, v16

    const v16, 0x7d76e30

    goto/16 :goto_b

    :sswitch_d
    move/from16 p2, v15

    if-eqz v1, :cond_6

    const-string v2, "\u1a75\u1a77"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x25

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x105d

    const v16, 0x34f9f55

    xor-int v15, v15, v16

    const v16, 0x7452fa0b

    goto/16 :goto_b

    :cond_6
    :goto_4
    const-string v2, "\u06ec\u1a77"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0xccd

    const v16, -0x6b886598

    xor-int v15, v15, v16

    const v16, 0x1b96657a

    goto/16 :goto_b

    :sswitch_e
    move/from16 p2, v15

    const/16 v2, 0x3cad

    const/16 v9, 0x3cad

    goto :goto_5

    :sswitch_f
    move/from16 p2, v15

    const v2, 0x840b

    const v9, 0x840b

    :goto_5
    const-string v2, "\u1a73\u1a78"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x3ec1

    const v16, -0x5100f85d

    xor-int v15, v15, v16

    const v16, -0x7946da25

    goto/16 :goto_b

    :sswitch_10
    move/from16 p2, v15

    add-int v2, v7, v8

    add-int/2addr v2, v2

    sub-int/2addr v2, v6

    if-ltz v2, :cond_7

    const-string v2, "\u06e7\u1a7b"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x17b7

    const v16, 0x36bdc110

    xor-int v15, v15, v16

    const v16, 0x767d0e32

    goto/16 :goto_b

    :cond_7
    const-string v2, "\u06e1\u06df"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, -0x73

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x5f39

    const v16, 0x41e9f5fa

    xor-int v15, v15, v16

    const v16, 0x7f919a7e

    goto/16 :goto_b

    :sswitch_11
    move/from16 p2, v15

    add-int v2, v4, v5

    mul-int v6, v2, v2

    mul-int v7, v4, v4

    const v8, 0xfce271

    .line 45
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v2

    if-gtz v2, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v2, "\u073a\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x3b

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x10e3

    const v16, -0x1373959e

    xor-int v15, v15, v16

    const v16, 0x1a0906f5

    goto/16 :goto_b

    :sswitch_12
    move/from16 p2, v15

    const/16 v2, 0x2b

    aget-short v4, v3, v2

    const/16 v5, 0xfe7

    .line 65
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_9
    const-string v2, "\u1a74\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x315

    const v16, 0x531cbb7

    xor-int v15, v15, v16

    const v16, 0x33443837

    goto/16 :goto_b

    :sswitch_13
    move/from16 p2, v15

    sget-object v3, Ll/ܿ᩺ۘ;->᩶ܽۛ:[S

    .line 7
    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v2, :cond_a

    :goto_6
    const-string v2, "\u06d6\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x77

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x30eb

    const v16, -0x77bc981

    xor-int v15, v15, v16

    const v16, 0x36c4a343

    goto/16 :goto_b

    :cond_a
    const-string v2, "\u1a76\u05a1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, -0x19

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x48a5

    const v16, -0x34235c1c    # -2.8919752E7f

    xor-int v15, v15, v16

    const v16, 0x61f94a87

    goto/16 :goto_b

    :sswitch_14
    move/from16 p2, v15

    .line 31
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v2, "\u06df\u06df"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x7b

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x4307

    const v16, 0x470f75a4

    xor-int v15, v15, v16

    const v16, 0x76072c3a

    goto/16 :goto_b

    :sswitch_15
    move/from16 p2, v15

    sget-boolean v2, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v2, :cond_c

    :goto_7
    const-string v2, "\u06da\u06df"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x79

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x324d

    const v16, 0x38183276

    xor-int v15, v15, v16

    const v16, -0x322d712

    goto/16 :goto_b

    :cond_c
    const-string v2, "\u06d6\u06df"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x7eb3

    const v16, 0x7478f22d

    xor-int v15, v15, v16

    const v16, 0x301a840d

    goto/16 :goto_b

    :sswitch_16
    move/from16 p2, v15

    .line 81
    sget-boolean v2, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v2, :cond_d

    :goto_8
    const-string v2, "\u06e1\u073a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x37

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x67a7

    const v16, -0x1486a169

    xor-int v15, v15, v16

    const v16, 0x6803481f

    goto/16 :goto_b

    :cond_d
    const-string v2, "\u06e1\u06da"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x65

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x3d83

    const v16, 0x145940f3

    xor-int v15, v15, v16

    const v16, -0xbbb9665

    goto/16 :goto_b

    :sswitch_17
    move/from16 p2, v15

    .line 16
    sget-boolean v2, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v2, :cond_e

    goto :goto_a

    :cond_e
    const-string v2, "\u06ec\u06e4"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x49

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x7bc3

    const v16, 0x7d64193e

    xor-int v15, v15, v16

    const v16, -0x15c29336

    goto :goto_b

    :sswitch_18
    move/from16 p2, v15

    .line 8
    sget-boolean v2, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v2, :cond_f

    :goto_9
    const-string v2, "\u05a8\u06dc"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x32a5

    const v16, -0x374d0420    # -366559.0f

    xor-int v15, v15, v16

    const v16, -0x30cc659c

    goto :goto_b

    :cond_f
    const-string v2, "\u1a79\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x4a2d

    const v16, -0x7396863b

    xor-int v15, v15, v16

    const v16, 0x2ade836f

    goto :goto_b

    :sswitch_19
    move/from16 p2, v15

    .line 16
    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v2, :cond_10

    :goto_a
    const-string v2, "\u0730\u06dc"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x39

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, 0x2b29

    const v16, -0x1e5bb289

    xor-int v15, v15, v16

    const v16, -0x131b4f14

    goto :goto_b

    :cond_10
    const-string v2, "\u1a74\u0730"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x19

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x7a45

    const v16, -0x42892d63

    xor-int v15, v15, v16

    const v16, -0x41c2217b

    :goto_b
    xor-int v16, v2, v16

    move v2, v15

    move/from16 v15, p2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x781d558f -> :sswitch_c
        -0x770f05a1 -> :sswitch_d
        -0x726d0e95 -> :sswitch_15
        -0x6dbae893 -> :sswitch_11
        -0x66ae6f61 -> :sswitch_4
        -0x650592c9 -> :sswitch_18
        -0x5929ca1f -> :sswitch_9
        -0x56556559 -> :sswitch_8
        -0x456b7e3a -> :sswitch_c
        -0x409780d7 -> :sswitch_19
        -0x3d2419fa -> :sswitch_12
        -0x38ee9f74 -> :sswitch_3
        -0x382489c5 -> :sswitch_5
        -0x354d49e7 -> :sswitch_3
        -0x337083a5 -> :sswitch_11
        -0x28107cd5 -> :sswitch_4
        -0x22a1d735 -> :sswitch_e
        -0x21552a84 -> :sswitch_9
        -0x19cac91d -> :sswitch_12
        -0x17e6bf0b -> :sswitch_f
        -0x1514438d -> :sswitch_2
        -0x11754dbb -> :sswitch_0
        -0x86e88fc -> :sswitch_10
        -0x2032f4 -> :sswitch_b
        0xe8dfa2 -> :sswitch_a
        0x1b93e9f -> :sswitch_10
        0x7205516 -> :sswitch_18
        0x9cea3a1 -> :sswitch_f
        0x195227d6 -> :sswitch_5
        0x1da7672b -> :sswitch_8
        0x1ef5d645 -> :sswitch_19
        0x1fc1e45d -> :sswitch_15
        0x21d8da19 -> :sswitch_7
        0x27813ff5 -> :sswitch_14
        0x27b87e09 -> :sswitch_d
        0x2d91e677 -> :sswitch_13
        0x3259a44c -> :sswitch_6
        0x3e3f7c19 -> :sswitch_a
        0x4275ab65 -> :sswitch_17
        0x46d9cf89 -> :sswitch_13
        0x46deb287 -> :sswitch_16
        0x4a8bcfbf -> :sswitch_e
        0x4fa90323 -> :sswitch_14
        0x556e91aa -> :sswitch_17
        0x58f87580 -> :sswitch_1
        0x59eb0cb3 -> :sswitch_1
        0x5a1eb94f -> :sswitch_0
        0x5e71534a -> :sswitch_6
        0x62102f56 -> :sswitch_7
        0x6b453449 -> :sswitch_b
        0x6e3139e7 -> :sswitch_2
        0x7fed3e63 -> :sswitch_16
    .end sparse-switch
.end method
