.class public final Ll/᩹۬᩸;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Ll/᩵۬᩸;


# static fields
.field public static ۢ:Z

.field public static final synthetic ᩳ:I


# instance fields
.field public final ֡:Ll/ۛ֡᩻;

.field public final ֫:Ll/ܽᩳ᩻;

.field public final ۗ:Landroid/view/View;

.field public final ۘ:Landroid/view/View;

.field public final ۙ:Ll/ܽ֡֫;

.field public final ۚ:Ll/ܽᩳ᩻;

.field public ۛ:Z

.field public ۟:Landroid/view/MenuItem;

.field public ۤ:Z

.field public final ۧ:Ll/ۛ֡᩻;

.field public final ۨ:Landroid/view/View;

.field public final ۫:Ll/ۗ۬᩸;

.field public ܰ:Ll/۬ۖۧ;

.field public ܳ:Ll/۟۬᩸;

.field public final ܶ:Ljava/lang/String;

.field public final ܺ:Ll/ۛ֡᩻;

.field public final ܽ:Ll/ۛ֡᩻;

.field public final ܿ:Landroid/widget/TextView;

.field public final ᩴ:Ll/ܽ᩶᩻;

.field public final ᩵:Landroid/view/View;

.field public final ᩶:Landroid/widget/TextView;

.field public final ᩷:Ll/ܽ۬᩸;

.field public final ᩸:Ll/᩺ۜ᩸;

.field public final ᩹:Ll/ۛ֡᩻;

.field public ᩺:Ll/ۧ᩸ᩴ;

.field public final ᩻:Ll/ۛ֡᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 100
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "sesrt"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/᩹۬᩸;->ۢ:Z

    return-void
.end method

.method public constructor <init>(Ll/֨֫ۧ;Ll/᩺ۜ᩸;Landroid/view/View;)V
    .locals 1

    .line 103
    new-instance v0, Ll/֡۠֫;

    invoke-direct {v0, p3}, Ll/֡۠֫;-><init>(Ljava/lang/Object;)V

    const-string p3, "code"

    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩹۬᩸;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;Ljava/lang/String;Ll/ܽ۬᩸;)V

    return-void
.end method

.method public constructor <init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;Ljava/lang/String;Ll/ܽ۬᩸;)V
    .locals 11

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Ll/۬ۖۧ;

    new-instance v1, Ll/ۨ᩹ۧ;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ll/ۨ᩹ۧ;-><init>(I)V

    invoke-direct {v0, p0, v1}, Ll/۬ۖۧ;-><init>(Ljava/lang/Object;Ll/ۜۖۧ;)V

    iput-object v0, p0, Ll/᩹۬᩸;->ܰ:Ll/۬ۖۧ;

    .line 111
    iput-object p1, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    .line 112
    iput-object p2, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    .line 113
    iput-object p3, p0, Ll/᩹۬᩸;->ܶ:Ljava/lang/String;

    .line 114
    new-instance v0, Ll/ۗ۬᩸;

    invoke-direct {v0, p1, p2}, Ll/ۗ۬᩸;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    .line 115
    iput-object p4, p0, Ll/᩹۬᩸;->᩷:Ll/ܽ۬᩸;

    .line 116
    invoke-interface {p4}, Ll/ܽ۬᩸;->ۙ()Landroid/view/View;

    move-result-object p4

    iput-object p4, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    const v0, 0x7f0a0504

    .line 117
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    const v0, 0x7f0a04fd

    .line 118
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۬᩸;->᩵:Landroid/view/View;

    const v0, 0x7f0a04fc

    .line 119
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۬᩸;->ۗ:Landroid/view/View;

    const v0, 0x7f0a0197

    .line 120
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܽᩳ᩻;

    iput-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    const v1, 0x7f0a0194

    .line 121
    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܽᩳ᩻;

    iput-object v1, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    .line 122
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v2

    invoke-static {v2}, Ll/ۙۤᩴ;->ۙ(Ll/᩹ۖ᩸;)V

    .line 123
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v2

    invoke-static {v2}, Ll/ۙۤᩴ;->ۙ(Ll/᩹ۖ᩸;)V

    const v2, 0x7f0a05e7

    .line 125
    invoke-virtual {p4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۛ֡᩻;

    iput-object v2, p0, Ll/᩹۬᩸;->᩹:Ll/ۛ֡᩻;

    const v3, 0x7f0a05d9

    .line 126
    invoke-virtual {p4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۛ֡᩻;

    iput-object v3, p0, Ll/᩹۬᩸;->ۧ:Ll/ۛ֡᩻;

    const v4, 0x7f0a05ea

    .line 127
    invoke-virtual {p4, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ۛ֡᩻;

    iput-object v4, p0, Ll/᩹۬᩸;->֡:Ll/ۛ֡᩻;

    const v5, 0x7f0a05e4

    .line 128
    invoke-virtual {p4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۛ֡᩻;

    iput-object v5, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    const v6, 0x7f0a05e6

    .line 129
    invoke-virtual {p4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/ۛ֡᩻;

    iput-object v6, p0, Ll/᩹۬᩸;->ܽ:Ll/ۛ֡᩻;

    const v7, 0x7f0a05e5

    .line 130
    invoke-virtual {p4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/ۛ֡᩻;

    iput-object v7, p0, Ll/᩹۬᩸;->ܺ:Ll/ۛ֡᩻;

    const v8, 0x7f0a0530

    .line 131
    invoke-virtual {p4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, p0, Ll/᩹۬᩸;->ܿ:Landroid/widget/TextView;

    const v9, 0x7f0a052f

    .line 132
    invoke-virtual {p4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, p0, Ll/᩹۬᩸;->᩶:Landroid/widget/TextView;

    const v9, 0x7f0a01eb

    .line 133
    invoke-virtual {p4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Ll/ܽ᩶᩻;

    iput-object v9, p0, Ll/᩹۬᩸;->ᩴ:Ll/ܽ᩶᩻;

    .line 134
    sget-boolean v10, Ll/᩹۬᩸;->ۢ:Z

    if-nez v10, :cond_0

    .line 135
    move-object v10, p4

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 137
    :cond_0
    new-instance v9, Ll/᩷۬᩸;

    const/4 v10, 0x0

    invoke-direct {v9, v10, p0, p1}, Ll/᩷۬᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v8, "_s"

    .line 175
    invoke-virtual {p3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 248
    invoke-virtual {v0, v8, v9}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_r"

    .line 176
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 248
    invoke-virtual {v1, p3, v9}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    new-instance p3, Ll/ۧ᩸ᩴ;

    invoke-direct {p3, p1, p2}, Ll/ۧ᩸ᩴ;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object p3, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    .line 261
    new-instance p1, Ll/ܶ᩸ᩴ;

    const v0, 0x7f0a0688

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p1, v0}, Ll/ܶ᩸ᩴ;-><init>(Landroid/widget/TextView;)V

    .line 262
    new-instance v0, Ll/۫۬᩸;

    invoke-direct {v0, p0, p1}, Ll/۫۬᩸;-><init>(Ll/᩹۬᩸;Ll/ܶ᩸ᩴ;)V

    invoke-virtual {p3, v0}, Ll/ۧ᩸ᩴ;->ۙ(Ll/ᩴ᩸ᩴ;)V

    .line 302
    new-instance p3, Ll/֨ۜ᩸;

    invoke-direct {p3, p0}, Ll/֨ۜ᩸;-><init>(Ll/᩹۬᩸;)V

    .line 318
    new-instance v0, Ll/ۡۜ᩸;

    invoke-direct {v0, p0}, Ll/ۡۜ᩸;-><init>(Ll/᩹۬᩸;)V

    invoke-virtual {p2, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/ۡۜ᩸;)V

    .line 323
    new-instance v0, Ll/ۖۜ᩸;

    invoke-direct {v0, p0, p1}, Ll/ۖۜ᩸;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 330
    new-instance v0, Ll/۠ۜ᩸;

    invoke-direct {v0, p0, p1}, Ll/۠ۜ᩸;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 368
    invoke-virtual {v2, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 369
    invoke-virtual {v3, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 370
    invoke-virtual {v4, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 371
    invoke-virtual {v5, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 372
    invoke-virtual {v7, v0}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    const p1, 0x7f0a0204

    const v0, 0x7f0a010a

    const v1, 0x7f0a0205

    const v2, 0x7f0a04fd

    const v3, 0x7f0a04fc

    .line 374
    filled-new-array {v1, p1, v3, v2, v0}, [I

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 375
    aget v1, p1, v0

    .line 376
    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 377
    invoke-static {v1}, Ll/ܽ۟֫;->ۙ(Landroid/view/View;)V

    .line 378
    invoke-virtual {v1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 380
    :cond_1
    iget-object p1, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    new-instance p3, Ll/ۚ۬᩸;

    invoke-direct {p3, p0}, Ll/ۚ۬᩸;-><init>(Ll/᩹۬᩸;)V

    invoke-virtual {p1, p3}, Ll/ܽᩳ᩻;->ۙ(Landroid/text/TextWatcher;)V

    .line 401
    new-instance p1, Ll/ۛ֨᩸;

    const/4 p3, 0x1

    invoke-direct {p1, p3, p0}, Ll/ۛ֨᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/Runnable;)V

    .line 402
    new-instance p1, Ll/ۜۜ᩸;

    invoke-direct {p1, p0}, Ll/ۜۜ᩸;-><init>(Ll/᩹۬᩸;)V

    invoke-virtual {p2, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ۧ᩷ᩴ;)V

    .line 179
    invoke-virtual {p0}, Ll/᩹۬᩸;->ܽ()V

    .line 180
    invoke-virtual {p2, p0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩵۬᩸;)V

    .line 181
    invoke-direct {p0}, Ll/᩹۬᩸;->ۗ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹۬᩸;)Ll/ۧ᩸ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    return-object p0
.end method

.method private ۗ()V
    .locals 3

    .line 864
    iget-object v0, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    iget-object v2, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 865
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Ll/ۗۡ֫;->ܽ:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void

    .line 867
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    .line 1105
    iget-object v1, v1, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget v1, v1, Ll/ܰۤᩴ;->ᩴۙ:I

    .line 867
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method private ۙ(I)V
    .locals 17

    move-object/from16 v10, p0

    .line 427
    invoke-direct/range {p0 .. p0}, Ll/᩹۬᩸;->ܶ()V

    .line 428
    iget-boolean v0, v10, Ll/᩹۬᩸;->ۤ:Z

    if-nez v0, :cond_2

    iget-boolean v0, v10, Ll/᩹۬᩸;->ۛ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x3

    iget-object v6, v10, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    move/from16 v9, p1

    if-ne v9, v0, :cond_0

    invoke-virtual {v6}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 429
    :cond_0
    iget-object v0, v10, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 422
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "srep"

    const-string v2, "$0\\n"

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 423
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    .line 431
    :goto_0
    iget-object v0, v10, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->᩷()I

    move-result v11

    .line 432
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۢۙ()Ll/᩵᩷ᩴ;

    move-result-object v12

    .line 433
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v13

    .line 434
    invoke-interface {v13}, Ll/ۡ᩶᩸;->ۛ᩷()I

    move-result v14

    .line 435
    new-instance v15, Ll/۟۬᩸;

    new-instance v5, Ll/ۙ۬᩸;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object v2, v7

    move v3, v11

    move-object v4, v12

    move-object v9, v5

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Ll/ۙ۬᩸;-><init>(Ll/᩹۬᩸;Ljava/lang/String;ILl/᩵᩷ᩴ;Ljava/lang/String;)V

    iget-object v0, v10, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    const v1, 0x7f120966

    invoke-direct {v15, v6, v0, v1, v9}, Ll/۟۬᩸;-><init>(Ll/᩺ۜ᩸;Ll/ܽ֡֫;ILjava/util/function/BooleanSupplier;)V

    .line 440
    iput-object v15, v10, Ll/᩹۬᩸;->ܳ:Ll/۟۬᩸;

    .line 441
    new-instance v16, Ll/ۧ۬᩸;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object v2, v15

    move-object v3, v13

    move v4, v14

    move-object v5, v7

    move v6, v11

    move-object v7, v8

    move-object v8, v12

    move/from16 v9, p1

    invoke-direct/range {v0 .. v9}, Ll/ۧ۬᩸;-><init>(Ll/᩹۬᩸;Ll/۟۬᩸;Ll/ᩳ۬᩸;ILjava/lang/String;ILjava/lang/String;Ll/᩵᩷ᩴ;I)V

    .line 529
    invoke-virtual/range {v16 .. v16}, Ll/ۖۙܺ;->۫()V

    :cond_2
    :goto_1
    return-void
.end method

.method public static ۙ(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V
    .locals 17

    .line 1015
    invoke-virtual/range {p1 .. p1}, Ll/᩺ۜ᩸;->ۖ᩷()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1016
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    const/4 v8, 0x0

    .line 1017
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v2

    .line 1018
    invoke-virtual/range {p1 .. p1}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v3

    if-le v2, v3, :cond_2

    move v10, v2

    move v9, v3

    goto :goto_2

    :cond_2
    move v9, v2

    move v10, v3

    .line 1025
    :goto_2
    invoke-interface/range {p0 .. p0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v11

    .line 1027
    invoke-interface {v11}, Landroid/view/Menu;->clear()V

    .line 1029
    invoke-static {}, Ll/ۚ֫ᩴ;->ۤ()Ljava/util/List;

    move-result-object v2

    .line 1030
    invoke-static {}, Ll/ۚ֫ᩴ;->᩸()Ljava/util/Map;

    move-result-object v12

    .line 1032
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v2, 0x0

    move-object v14, v2

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ll/᩸֫ᩴ;

    .line 1033
    invoke-virtual {v15}, Ll/᩸֫ᩴ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/Integer;

    if-nez v16, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v15

    move-object/from16 v3, p1

    move v4, v0

    move v5, v8

    move v6, v9

    move v7, v10

    .line 1037
    invoke-virtual/range {v2 .. v7}, Ll/᩸֫ᩴ;->ۙ(Ll/᩺ۜ᩸;ZZII)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 1041
    :cond_4
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12c

    if-lt v2, v3, :cond_6

    if-nez v14, :cond_5

    const v2, 0xffff

    const v3, 0x7f1207f2

    .line 1043
    invoke-interface {v11, v1, v1, v2, v3}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v2

    const v3, 0x7f08023e

    .line 1044
    invoke-interface {v2, v3}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    move-object v14, v2

    .line 1046
    :cond_5
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15}, Ll/᩸֫ᩴ;->᩷()Ll/ۤ֫ᩴ;

    move-result-object v3

    invoke-interface {v14, v1, v1, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v2

    goto :goto_4

    .line 1048
    :cond_6
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15}, Ll/᩸֫ᩴ;->᩷()Ll/ۤ֫ᩴ;

    move-result-object v3

    invoke-interface {v11, v1, v1, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v2

    .line 1050
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v15, v3}, Ll/᩸֫ᩴ;->ۙ(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    goto :goto_3

    :cond_7
    return-void
.end method

.method private ۙ(Ll/᩵ۙᩴ;Ljava/lang/Runnable;)V
    .locals 6

    .line 677
    iget-boolean v0, p1, Ll/᩵ۙᩴ;->ᩴ:Z

    iget-boolean v1, p1, Ll/᩵ۙᩴ;->᩸:Z

    .line 678
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 679
    invoke-direct {p0}, Ll/᩹۬᩸;->ۨ()V

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    .line 680
    :goto_0
    iget-object v5, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 681
    :cond_1
    iget-object v4, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 682
    invoke-direct {p0}, Ll/᩹۬᩸;->ۗ()V

    .line 683
    iget-object v2, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    if-eqz v0, :cond_2

    .line 684
    iget-object v4, p1, Ll/᩵ۙᩴ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 685
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_2
    if-eqz v1, :cond_3

    .line 688
    iget-object v4, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    iget-object p1, p1, Ll/᩵ۙᩴ;->᩷:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 689
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 690
    iget-object p1, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 692
    :cond_3
    iget-object p1, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    if-eqz v0, :cond_5

    .line 693
    iget-object v0, p0, Ll/᩹۬᩸;->᩵:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 694
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    iget-object v5, p0, Ll/᩹۬᩸;->ۗ:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 696
    invoke-virtual {v2}, Ll/ܽᩳ᩻;->᩸()I

    move-result v2

    if-eqz v2, :cond_4

    .line 697
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    :cond_4
    if-eqz v1, :cond_6

    .line 699
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result p1

    if-nez p1, :cond_6

    .line 700
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 703
    :cond_5
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->֨ۤ()V

    .line 705
    :cond_6
    :goto_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    const-class v1, Ll/ۡ᩷ۧ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 933
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;I[Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq p1, p4, :cond_0

    .line 922
    aget-object p1, p2, p4

    .line 923
    invoke-virtual {p0, p1}, Ll/᩹۬᩸;->᩷(Ljava/lang/String;)V

    .line 924
    iget-object p0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {p0, p1}, Ll/᩺ۜ᩸;->᩷(Ljava/lang/String;)V

    .line 926
    :cond_0
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static ۙ(Ll/᩹۬᩸;Landroid/view/MenuItem;)V
    .locals 2

    .line 159
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f120375

    if-ne p1, v0, :cond_1

    .line 535
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "srep"

    const-string v1, "$0\\n"

    invoke-interface {p1, v0, v1}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 536
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    .line 540
    :goto_0
    new-instance p1, Ll/᩻۬᩸;

    iget-object v0, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    invoke-direct {p1, p0, v0, v1}, Ll/᩻۬᩸;-><init>(Ll/᩹۬᩸;Ll/ܽ֡֫;Ljava/lang/String;)V

    return-void

    :cond_1
    const v0, 0x7f120371

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    .line 163
    invoke-direct {p0, p1}, Ll/᩹۬᩸;->ۙ(I)V

    return-void

    :cond_2
    const v0, 0x7f120372

    if-ne p1, v0, :cond_3

    const/4 p1, 0x2

    .line 165
    invoke-direct {p0, p1}, Ll/᩹۬᩸;->ۙ(I)V

    return-void

    :cond_3
    const v0, 0x7f120373

    if-ne p1, v0, :cond_4

    const/4 p1, 0x3

    .line 167
    invoke-direct {p0, p1}, Ll/᩹۬᩸;->ۙ(I)V

    return-void

    :cond_4
    const v0, 0x7f120374

    if-ne p1, v0, :cond_5

    const/4 p1, 0x4

    .line 169
    invoke-direct {p0, p1}, Ll/᩹۬᩸;->ۙ(I)V

    :cond_5
    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;Landroid/view/View;)V
    .locals 4

    .line 303
    iget-object v0, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    iget-object v1, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    iget-object v2, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x7f0a0205

    if-ne p1, v3, :cond_0

    .line 305
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ۧ᩸ᩴ;->᩷(Ljava/lang/String;)V

    return-void

    :cond_0
    const v3, 0x7f0a0204

    if-ne p1, v3, :cond_1

    .line 307
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ۧ᩸ᩴ;->ۙ(Ljava/lang/String;)V

    return-void

    :cond_1
    const v3, 0x7f0a04fc

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    .line 309
    invoke-virtual {p0, p1}, Ll/᩹۬᩸;->ۙ(Z)Z

    move-result p0

    if-nez p0, :cond_4

    .line 310
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/ۧ᩸ᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const v3, 0x7f0a04fd

    if-ne p1, v3, :cond_3

    .line 313
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/ۧ᩸ᩴ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const v0, 0x7f0a010a

    if-ne p1, v0, :cond_4

    .line 315
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩸()V

    :cond_4
    return-void
.end method

.method public static ۙ(Ll/᩹۬᩸;Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 253
    iget-object p0, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    const v0, 0x7f12030b

    .line 254
    invoke-virtual {p0, v0}, Ll/ۖۖۧ;->᩷(I)V

    .line 255
    invoke-static {p1}, Ll/ܿܶۤ;->ۙ(Ljava/util/regex/PatternSyntaxException;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const p1, 0x7f12018c

    const/4 v0, 0x0

    .line 256
    invoke-virtual {p0, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 257
    invoke-virtual {p0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;Ll/ܶ᩸ᩴ;Ll/ۛ֡᩻;ZZ)V
    .locals 4

    .line 331
    iget-object v0, p0, Ll/᩹۬᩸;->ܶ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v2, 0x7f0a05e7

    const-string v3, "_bit"

    if-ne p2, v2, :cond_2

    .line 333
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->᩸(Z)V

    if-eqz p4, :cond_1

    if-eqz p3, :cond_0

    const p2, 0x7f1209c1

    goto :goto_0

    :cond_0
    const p2, 0x7f1209c0

    .line 335
    :goto_0
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 337
    :cond_1
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 337
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 338
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    return-void

    :cond_2
    const v2, 0x7f0a05ea

    if-ne p2, v2, :cond_5

    .line 340
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->ᩴ(Z)V

    if-eqz p4, :cond_4

    if-eqz p3, :cond_3

    const p2, 0x7f120d52

    goto :goto_1

    :cond_3
    const p2, 0x7f120d51

    .line 342
    :goto_1
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 344
    :cond_4
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 344
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 345
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    return-void

    :cond_5
    const v2, 0x7f0a05d9

    if-ne p2, v2, :cond_8

    .line 347
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->ۙ(Z)V

    if-eqz p4, :cond_7

    if-eqz p3, :cond_6

    const p2, 0x7f1205a7

    goto :goto_2

    :cond_6
    const p2, 0x7f1205a6

    .line 349
    :goto_2
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 351
    :cond_7
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 351
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 352
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    return-void

    :cond_8
    const v2, 0x7f0a05e5

    if-ne p2, v2, :cond_b

    .line 354
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->ۤ(Z)V

    if-eqz p4, :cond_a

    if-eqz p3, :cond_9

    const p2, 0x7f1208f1

    goto :goto_3

    :cond_9
    const p2, 0x7f1208f0

    .line 356
    :goto_3
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    if-eqz p3, :cond_a

    .line 357
    iget-object p0, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    const-string p1, "page_search"

    const p2, 0x7f1208f2

    invoke-static {p2, p0, p1}, Ll/۫۠ᩴ;->᩷(ILl/ܽ֡֫;Ljava/lang/String;)V

    .line 359
    :cond_a
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 0
    invoke-static {v0, v3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 359
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void

    :cond_b
    const p0, 0x7f0a05e4

    if-ne p2, p0, :cond_e

    .line 361
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->᩷(Z)V

    if-eqz p4, :cond_d

    if-eqz p3, :cond_c

    const p0, 0x7f1208ae

    goto :goto_4

    :cond_c
    const p0, 0x7f120102

    :goto_4
    const/16 p2, 0x5dc

    .line 363
    invoke-virtual {p1, p0, p2}, Ll/ܶ᩸ᩴ;->ۙ(II)V

    .line 365
    :cond_d
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 0
    invoke-static {v0, v3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 365
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    :cond_e
    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;Ll/ܶ᩸ᩴ;ZZ)V
    .locals 0

    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 325
    iget-object p2, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {p2}, Ll/᩺ۜ᩸;->֨ۤ()V

    .line 326
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    const p0, 0x7f120abd

    const/16 p2, 0x7d0

    .line 327
    invoke-virtual {p1, p0, p2}, Ll/ܶ᩸ᩴ;->ۙ(II)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩹۬᩸;Ll/ܽ֡֫;Landroid/view/View;)V
    .locals 4

    .line 138
    iget-object v0, p0, Ll/᩹۬᩸;->ܿ:Landroid/widget/TextView;

    sget-boolean v1, Ll/᩹۬᩸;->ۢ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 139
    sput-boolean v2, Ll/᩹۬᩸;->ۢ:Z

    .line 140
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v3, "sesrt"

    .line 0
    invoke-static {v1, v3, v2}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    .line 141
    iget-object v1, p0, Ll/᩹۬᩸;->ᩴ:Ll/ܽ᩶᩻;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->isUnderlineText()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 143
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 144
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 147
    :cond_0
    iget-object v0, p0, Ll/᩹۬᩸;->᩶:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 148
    new-instance v3, Ll/ܿܽ;

    .line 68
    invoke-direct {v3, p1, p2, v2}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 149
    invoke-virtual {v3}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    .line 150
    invoke-virtual {p1, v1}, Ll/ۢۚ;->setOptionalIconsVisible(Z)V

    .line 151
    invoke-virtual {p1, v1}, Ll/ۢۚ;->setGroupDividerEnabled(Z)V

    const p2, 0x7f120370

    .line 152
    invoke-static {p1, p2}, Ll/֨ۚ;->ۙ(Ll/ۢۚ;I)V

    const p2, 0x7f120371

    .line 153
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f08026f

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120372

    .line 154
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f0801ff

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120373

    .line 155
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f08024f

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120374

    .line 156
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f08020c

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120375

    .line 157
    invoke-virtual {p1, p2, p2, v2, p2}, Ll/ۢۚ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x7f08025a

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 158
    new-instance p1, Ll/۬ۜ᩸;

    invoke-direct {p1, p0}, Ll/۬ۜ᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 173
    invoke-static {v3}, Ll/ᩳܽ;->ۙ(Ll/ܿܽ;)Ll/ܳ֫;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܳ֫;->ܳ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;Ll/ᩳ۬᩸;)V
    .locals 1

    .line 724
    iget-boolean v0, p0, Ll/᩹۬᩸;->ۤ:Z

    if-nez v0, :cond_0

    iget-object p0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p0

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Editor owner changed during restoration"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۙ(Ll/᩹۬᩸;Ll/᩵ۙᩴ;)V
    .locals 2

    .line 672
    new-instance v0, Ll/ܳܿ֫;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܳܿ֫;-><init>(I)V

    invoke-direct {p0, p1, v0}, Ll/᩹۬᩸;->ۙ(Ll/᩵ۙᩴ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۙ(Ll/᩹۬᩸;Z)V
    .locals 2

    .line 319
    invoke-direct {p0}, Ll/᩹۬᩸;->ܶ()V

    .line 320
    iget-object p0, p0, Ll/᩹۬᩸;->ܽ:Ll/ۛ֡᩻;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    invoke-virtual {p0, p1, v0}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    return-void
.end method

.method public static ۙ(Ll/᩹۬᩸;Ljava/lang/String;ILl/᩵᩷ᩴ;Ljava/lang/String;)Z
    .locals 1

    .line 436
    iget-boolean v0, p0, Ll/᩹۬᩸;->ۤ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩹۬᩸;->ۛ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    .line 437
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {p1}, Ll/ۧ᩸ᩴ;->᩷()I

    move-result p1

    if-ne p2, p1, :cond_1

    iget-object p0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    .line 438
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۢۙ()Ll/᩵᩷ᩴ;

    move-result-object p0

    invoke-static {p3, p0}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 422
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string p1, "srep"

    const-string p2, "$0\\n"

    invoke-interface {p0, p1, p2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 423
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p0

    .line 439
    :goto_0
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/᩹۬᩸;)Ll/۟۬᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬᩸;->ܳ:Ll/۟۬᩸;

    return-object p0
.end method

.method public static synthetic ۤ(Ll/᩹۬᩸;)V
    .locals 0

    .line 402
    invoke-direct {p0}, Ll/᩹۬᩸;->᩵()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹۬᩸;)Ll/۬ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬᩸;->ܰ:Ll/۬ۖۧ;

    return-object p0
.end method

.method private ۨ()V
    .locals 4

    .line 406
    iget-object v0, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ܳ()Z

    move-result v1

    .line 112
    iget-object v2, p0, Ll/᩹۬᩸;->᩹:Ll/ۛ֡᩻;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 407
    iget-object v1, p0, Ll/᩹۬᩸;->ۧ:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۤ()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 408
    iget-object v1, p0, Ll/᩹۬᩸;->֡:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->۫()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 409
    iget-object v1, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->᩸()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 410
    iget-object v1, p0, Ll/᩹۬᩸;->ܺ:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ᩴ()Z

    move-result v0

    .line 112
    invoke-virtual {v1, v0, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/᩹۬᩸;)Ll/᩺ۜ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/᩹۬᩸;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    return-object p0
.end method

.method private ܶ()V
    .locals 1

    .line 415
    iget-object v0, p0, Ll/᩹۬᩸;->ܳ:Ll/۟۬᩸;

    if-eqz v0, :cond_0

    .line 416
    invoke-virtual {v0}, Ll/۟۬᩸;->ۤ()V

    const/4 v0, 0x0

    .line 417
    iput-object v0, p0, Ll/᩹۬᩸;->ܳ:Ll/۟۬᩸;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/᩹۬᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹۬᩸;->ܶ()V

    return-void
.end method

.method public static synthetic ᩴ(Ll/᩹۬᩸;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/᩹۬᩸;->᩹()V

    return-void
.end method

.method private ᩵()V
    .locals 8

    .line 580
    invoke-virtual {p0}, Ll/᩹۬᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 583
    :cond_0
    iget-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩸()I

    move-result v0

    iget-object v1, p0, Ll/᩹۬᩸;->᩶:Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩹۬᩸;->ܿ:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 617
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v3, "0"

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 618
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 585
    :cond_1
    sget-object v0, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 586
    sget-object v0, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    .line 589
    :cond_2
    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    iget-object v3, v0, Ll/᩺ۜ᩸;->ۛ᩸:Ll/ۖ᩷ᩴ;

    .line 591
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v4

    .line 592
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v5, 0x0

    aget v6, v4, v5

    const/4 v7, 0x1

    aget v4, v4, v7

    invoke-virtual {v3, v0, v6, v4}, Ll/ۖ᩷ᩴ;->ۙ(Landroid/content/Context;II)Ll/۟᩷ᩴ;

    move-result-object v0

    .line 594
    sget-boolean v3, Ll/᩹۬᩸;->ۢ:Z

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Ll/۟᩷ᩴ;->size()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_3

    .line 595
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 596
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 597
    iget-object v3, p0, Ll/᩹۬᩸;->ᩴ:Ll/ܽ᩶᩻;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v6, 0x8

    if-ne v4, v6, :cond_3

    .line 598
    invoke-virtual {v3, v5, v5}, Landroid/view/View;->measure(II)V

    .line 599
    invoke-virtual {v3}, Ll/ܽ᩶᩻;->ۤ()Ll/ܺ᩶᩻;

    move-result-object v4

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {v4, v6}, Ll/ܺ᩶᩻;->ۙ(F)V

    .line 36
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    const/4 v4, 0x0

    .line 37
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 38
    fill-array-data v4, :array_0

    const-string v5, "alpha"

    invoke-static {v3, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v4, 0x96

    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 603
    :cond_3
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 604
    sget-object v3, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 605
    sget-object v2, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 606
    :cond_4
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 607
    sget v3, Ll/ۗۡ֫;->ܶۙ:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 608
    sget v2, Ll/ۗۡ֫;->ܶۙ:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 610
    :cond_5
    sget-object v3, Ll/ۗۡ֫;->ۧۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 611
    sget-object v2, Ll/ۗۡ֫;->ۧۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 613
    :goto_0
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 617
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 618
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static ᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 229
    :cond_0
    new-instance v0, Ll/ܰ۠֫;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ܰ۠֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 231
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    if-ne p0, p1, :cond_1

    .line 232
    invoke-virtual {v0}, Ll/ܰ۠֫;->run()V

    return-void

    .line 234
    :cond_1
    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩹۬᩸;)V
    .locals 2

    .line 243
    iget-object p0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 244
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static synthetic ᩸(Ll/᩹۬᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹۬᩸;->᩵()V

    return-void
.end method

.method private ᩹()V
    .locals 2

    .line 858
    iget-boolean v0, p0, Ll/᩹۬᩸;->ۤ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩹۬᩸;->ۛ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/᩹۬᩸;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    iget-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v1, v0}, Ll/ۧ᩸ᩴ;->ۤ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩹۬᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩹۬᩸;->ܳ:Ll/۟۬᩸;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 907
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ۚ()Z

    move-result v0

    return v0
.end method

.method public final ۙ()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 770
    invoke-virtual {p0, v0, v1}, Ll/᩹۬᩸;->ۙ(ZZ)V

    return-void
.end method

.method public final ۙ(Landroid/view/MenuItem;)V
    .locals 1

    .line 220
    iput-object p1, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    .line 221
    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Class;)V
    .locals 1

    .line 895
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/Class;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 215
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/String;)V

    .line 216
    iget-object p1, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;Z)V
    .locals 1

    .line 891
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1, p2}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۙ(Ll/ۛۚۤ;)V
    .locals 1

    .line 876
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/ۛۚۤ;)V

    return-void
.end method

.method public final ۙ(Ll/ۤ᩻ۙ;Ll/ۚۨ᩸;Ljava/lang/Class;)V
    .locals 2

    .line 192
    new-instance v0, Ll/ܳ۬᩸;

    invoke-direct {v0, p0, p3}, Ll/ܳ۬᩸;-><init>(Ll/᩹۬᩸;Ljava/lang/Class;)V

    iget-object p3, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    .line 210
    invoke-virtual {p3}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object p3

    iget-object v1, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    .line 211
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v1

    .line 192
    invoke-virtual {p2, p1, v0, p3, v1}, Ll/ۚۨ᩸;->ۙ(Ll/ۤ᩻ۙ;Ll/۟ܳᩴ;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    return-void
.end method

.method public final ۙ(Ll/ۨۤᩴ;Ll/ۗۙᩴ;Ll/ۗۤᩴ;Ll/ܶۜ᩸;)V
    .locals 1

    .line 711
    iget-boolean v0, p0, Ll/᩹۬᩸;->ۤ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩹۬᩸;->ۛ:Z

    if-nez v0, :cond_0

    .line 712
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p2}, Ll/ۗ۬᩸;->ۙ(Ll/ۗۙᩴ;)Ll/ܶ᩷ᩴ;

    move-result-object p2

    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩺ۜ᩸;->ۙ(Ll/ۨۤᩴ;Ll/ܶ᩷ᩴ;Ll/ۗۤᩴ;Ll/ܶۜ᩸;)V

    return-void

    .line 711
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Editor helper cannot prepare session state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/ۨۤᩴ;Ll/ۗۙᩴ;Ll/᩵ۙᩴ;)V
    .locals 7

    .line 720
    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ᩳ()V

    .line 721
    iget-boolean v1, p0, Ll/᩹۬᩸;->ۤ:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/᩹۬᩸;->ۛ:Z

    if-nez v1, :cond_3

    .line 722
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    .line 723
    new-instance v2, Ll/ۤۖᩴ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0, v1}, Ll/ۤۖᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 726
    iput-boolean v1, p0, Ll/᩹۬᩸;->ۛ:Z

    .line 727
    iget-object v1, p0, Ll/᩹۬᩸;->ܰ:Ll/۬ۖۧ;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v4, 0x0

    .line 729
    :try_start_0
    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ۨۤᩴ;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v6, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    if-nez v5, :cond_0

    .line 730
    :try_start_1
    invoke-virtual {v6, p2}, Ll/ۗ۬᩸;->ۙ(Ll/ۗۙᩴ;)Ll/ܶ᩷ᩴ;

    move-result-object p2

    .line 731
    invoke-virtual {v0, p1, p2}, Ll/᩺ۜ᩸;->ۙ(Ll/ۨۤᩴ;Ll/ܶ᩷ᩴ;)V

    .line 733
    :cond_0
    invoke-virtual {v2}, Ll/ۤۖᩴ;->run()V

    .line 734
    invoke-virtual {v6}, Ll/ۗ۬᩸;->ۙ()V

    .line 735
    iget-object p1, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    .line 736
    iget-boolean p1, p3, Ll/᩵ۙᩴ;->ᩴ:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    iget-object p2, p3, Ll/᩵ۙᩴ;->ۙ:Ljava/lang/Byte;

    if-nez p2, :cond_1

    .line 737
    sget-object p2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/᩹۬᩸;->ܶ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_bit"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v4, v0}, Ll/ۢ֫ܺ;->ۙ(BLjava/lang/String;)B

    move-result p2

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    .line 736
    :goto_0
    invoke-virtual {p1, p2}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 738
    :cond_2
    invoke-direct {p0, p3, v2}, Ll/᩹۬᩸;->ۙ(Ll/᩵ۙᩴ;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 740
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 741
    iput-boolean v4, p0, Ll/᩹۬᩸;->ۛ:Z

    .line 743
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    return-void

    :catchall_0
    move-exception p1

    .line 740
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 741
    iput-boolean v4, p0, Ll/᩹۬᩸;->ۛ:Z

    .line 742
    throw p1

    .line 721
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Editor helper cannot restore session state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/᩵ۚۤ;)V
    .locals 1

    .line 880
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/᩵ۚۤ;)V

    .line 881
    iget-object p1, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(ZZ)V
    .locals 8

    .line 775
    invoke-virtual {p0}, Ll/᩹۬᩸;->۫()Z

    move-result v0

    const/4 v1, 0x1

    .line 776
    iget-object v2, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    if-nez v0, :cond_1

    .line 777
    iget-object v5, v4, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v5}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 779
    :cond_0
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Ll/᩹۬᩸;->ܶ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_bit"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v3, v6}, Ll/ۢ֫ܺ;->ۙ(BLjava/lang/String;)B

    move-result v5

    invoke-virtual {v2, v5}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 780
    invoke-direct {p0}, Ll/᩹۬᩸;->ۨ()V

    .line 781
    iget-object v5, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 782
    iget-object v5, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 783
    invoke-direct {p0}, Ll/᩹۬᩸;->ۗ()V

    .line 784
    iget-object v5, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 785
    iget-object v5, p0, Ll/᩹۬᩸;->᩵:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 786
    invoke-virtual {v4}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v5

    xor-int/2addr v5, v1

    iget-object v6, p0, Ll/᩹۬᩸;->ۗ:Landroid/view/View;

    invoke-virtual {v6, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 788
    :cond_1
    iget-object v5, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    if-eqz p1, :cond_2

    .line 789
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 790
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v6

    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 792
    :cond_2
    invoke-virtual {v4}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v6

    .line 793
    aget v3, v6, v3

    .line 794
    aget v1, v6, v1

    if-eq v3, v1, :cond_4

    sub-int v6, v1, v3

    const v7, 0xc350

    if-gt v6, v7, :cond_4

    if-nez p2, :cond_4

    .line 797
    :try_start_0
    invoke-virtual {v4}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p2

    invoke-interface {p2, v3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 798
    invoke-virtual {v2}, Ll/ۧ᩸ᩴ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 799
    invoke-static {p2}, Ll/ܽۚܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 800
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 801
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 802
    :cond_3
    invoke-virtual {v5, p2}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_6

    .line 804
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->֫()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_4
    if-nez v0, :cond_5

    .line 810
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->ۚ()V

    if-eqz p1, :cond_6

    .line 812
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->֫()V

    goto :goto_0

    :cond_5
    if-nez p2, :cond_6

    goto :goto_1

    .line 817
    :cond_6
    :goto_0
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->᩸()I

    move-result p1

    if-eqz p1, :cond_7

    .line 818
    invoke-virtual {p0}, Ll/᩹۬᩸;->᩻()V

    goto :goto_1

    .line 820
    :cond_7
    invoke-direct {p0}, Ll/᩹۬᩸;->᩵()V

    :goto_1
    return-void
.end method

.method public final ۙ(Z)Z
    .locals 3

    .line 748
    iget-object v0, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 749
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 750
    iget-object v0, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 751
    iget-object v0, p0, Ll/᩹۬᩸;->᩵:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 752
    iget-object v0, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 753
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۚ()V

    .line 754
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->֫()V

    if-eqz p1, :cond_0

    .line 756
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    :cond_0
    return v1

    :cond_1
    return v2
.end method

.method public final ۚ()V
    .locals 4

    .line 955
    new-instance v0, Ll/ܺ۬᩸;

    iget-object v1, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    invoke-direct {v0, p0, v1}, Ll/ܺ۬᩸;-><init>(Ll/᩹۬᩸;Ll/ܽ֡֫;)V

    const v1, 0x7f1207a2

    .line 969
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->ܺ(I)V

    const/4 v1, 0x2

    .line 970
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->ᩴ(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "1\u2026"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    .line 971
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->᩶ۙ()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/۠ۢᩴ;->ۤ(Ljava/lang/String;)V

    .line 972
    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۙ()V

    .line 973
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->᩸(I)V

    const/4 v1, 0x1

    .line 202
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->᩷(Z)V

    return-void
.end method

.method public final ۤ()Ll/ܶ۬᩸;
    .locals 5

    .line 636
    iget-object v0, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 637
    iget-object v2, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x1

    .line 638
    :cond_1
    new-instance v2, Ll/ܶ۬᩸;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    if-eqz v1, :cond_3

    .line 639
    iget-object v1, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v1}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    :cond_3
    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result v1

    iget-object v4, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v4}, Ll/ۗ۬᩸;->ۤ()Ll/ܶ᩷ᩴ;

    move-result-object v4

    invoke-direct {v2, v0, v3, v1, v4}, Ll/ܶ۬᩸;-><init>(Ll/ᩳ۬᩸;Ll/ᩳ۬᩸;ILl/ܶ᩷ᩴ;)V

    return-object v2
.end method

.method public final ۧ()V
    .locals 3

    .line 239
    iget-object v0, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 240
    iget-object v0, p0, Ll/᩹۬᩸;->۟:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v1, v0}, Ll/ۗ۬᩸;->ۙ(Z)V

    .line 241
    invoke-virtual {v1}, Ll/ۗ۬᩸;->ۤ()Ll/ܶ᩷ᩴ;

    move-result-object v0

    .line 242
    new-instance v1, Ll/֨֨᩸;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֨֨᩸;-><init>(ILjava/lang/Object;)V

    iget-object v2, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v2, v0, v1}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶ᩷ᩴ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 824
    iget-object v0, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 951
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()V
    .locals 1

    .line 947
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ۧ()V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    .line 186
    iget-object v0, p0, Ll/᩹۬᩸;->᩷:Ll/ܽ۬᩸;

    invoke-interface {v0}, Ll/ܽ۬᩸;->᩷()Ll/᩸᩸ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 187
    :goto_0
    iget-object v2, p0, Ll/᩹۬᩸;->ܺ:Ll/ۛ֡᩻;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v1, v0}, Ll/ۧ᩸ᩴ;->ۙ(Ll/᩸᩸ᩴ;)V

    return-void
.end method

.method public final ᩴ()V
    .locals 2

    const/4 v0, 0x1

    .line 899
    iput-boolean v0, p0, Ll/᩹۬᩸;->ۤ:Z

    .line 900
    invoke-direct {p0}, Ll/᩹۬᩸;->ܶ()V

    .line 901
    iget-object v0, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 902
    iget-object v0, p0, Ll/᩹۬᩸;->ܰ:Ll/۬ۖۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 903
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_0
    sget-object v1, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 770
    invoke-virtual {p0, v0, v0}, Ll/᩹۬᩸;->ۙ(ZZ)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 3

    .line 938
    iget-object v0, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 939
    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->᩷(Ljava/lang/String;)V

    .line 940
    invoke-virtual {v0}, Ll/ۗ۬᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۗ۬᩸;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 941
    :cond_0
    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    const/4 v2, 0x1

    .line 2119
    invoke-virtual {v0, p1, v2}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    :cond_1
    if-nez v1, :cond_2

    .line 943
    iget-object p1, p0, Ll/᩹۬᩸;->᩷:Ll/ܽ۬᩸;

    invoke-interface {p1}, Ll/ܽ۬᩸;->ۤ()V

    :cond_2
    return-void
.end method

.method public final ᩷(Ll/ۛۚۤ;)V
    .locals 3

    .line 624
    iget-object v0, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 625
    iget-object v2, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x1

    .line 626
    :cond_1
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Z)V

    .line 627
    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->ۙ(Z)V

    const-string v2, ""

    if-eqz v0, :cond_2

    .line 628
    iget-object v0, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_3

    .line 629
    iget-object v0, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    const/16 v0, 0x7272

    .line 630
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->᩻(I)V

    .line 631
    iget-object v0, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeByte(I)V

    return-void
.end method

.method public final ᩷(Ll/᩵ۚۤ;)V
    .locals 3

    .line 663
    invoke-static {p1}, Ll/᩵ۙᩴ;->ۙ(Ll/᩵ۚۤ;)Ll/᩵ۙᩴ;

    move-result-object p1

    .line 668
    iget-boolean v0, p1, Ll/᩵ۙᩴ;->ᩴ:Z

    if-eqz v0, :cond_1

    .line 669
    iget-object v0, p1, Ll/᩵ۙᩴ;->ۙ:Ljava/lang/Byte;

    if-nez v0, :cond_0

    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/᩹۬᩸;->ܶ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_bit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ll/ۢ֫ܺ;->ۙ(BLjava/lang/String;)B

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    :goto_0
    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    invoke-virtual {v1, v0}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 672
    :cond_1
    new-instance v0, Ll/ᩴ۬᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ᩴ۬᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩷(Landroid/view/MenuItem;)Z
    .locals 6

    .line 978
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a04d8

    const/4 v2, 0x1

    .line 979
    iget-object v3, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    if-ne v0, v1, :cond_0

    .line 980
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->֡ۤ()V

    return v2

    :cond_0
    const v1, 0x7f0a06ad

    if-ne v0, v1, :cond_1

    .line 982
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ܺ᩸()V

    return v2

    :cond_1
    const v1, 0x7f0a036d

    if-ne v0, v1, :cond_2

    .line 984
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->᩸()V

    return v2

    :cond_2
    const v1, 0x7f0a0384

    if-ne v0, v1, :cond_3

    .line 986
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ܳۙ()V

    return v2

    :cond_3
    const v1, 0x7f0a03bd

    if-ne v0, v1, :cond_4

    .line 988
    invoke-virtual {p0}, Ll/᩹۬᩸;->ۙ()V

    return v2

    :cond_4
    const v1, 0x7f0a0399

    if-ne v0, v1, :cond_5

    .line 990
    invoke-virtual {p0}, Ll/᩹۬᩸;->ۚ()V

    return v2

    :cond_5
    const v1, 0x7f0a03ce

    .line 991
    iget-object v4, p0, Ll/᩹۬᩸;->ۙ:Ll/ܽ֡֫;

    const/4 v5, 0x0

    if-ne v0, v1, :cond_6

    .line 916
    invoke-static {}, Ll/ۡۧᩴ;->ܳ()Ljava/util/List;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 917
    invoke-static {}, Ll/ۡۧᩴ;->ܳ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/᩹۬᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v1}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 918
    invoke-virtual {v4}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v3, 0x7f1207ce

    .line 919
    invoke-virtual {v1, v3}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v3, Ll/ۤ۬᩸;

    invoke-direct {v3, p0, v0, p1}, Ll/ۤ۬᩸;-><init>(Ll/᩹۬᩸;I[Ljava/lang/String;)V

    .line 920
    invoke-virtual {v1, p1, v0, v3}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    const/4 v0, 0x0

    .line 928
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120bd5

    .line 929
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 930
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    .line 931
    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۗ᩷ۚ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۗ᩷ۚ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v2

    :cond_6
    const v1, 0x7f0a03c1

    if-ne v0, v1, :cond_7

    .line 994
    const-class p1, Ll/ۜܺ᩸;

    invoke-virtual {p0, p1}, Ll/᩹۬᩸;->ۙ(Ljava/lang/Class;)V

    return v2

    :cond_7
    const v1, 0x7f0a03cc

    if-ne v0, v1, :cond_8

    .line 996
    invoke-virtual {p0}, Ll/᩹۬᩸;->ۧ()V

    return v2

    :cond_8
    const v1, 0x7f0a0585

    if-ne v0, v1, :cond_a

    .line 998
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ۚۤ()Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-virtual {v3, v0}, Ll/᩺ۜ᩸;->ۨ(Z)V

    .line 999
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ۚۤ()Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 1000
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ۚۤ()Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "smooth_mode"

    const v0, 0x7f120b72

    .line 1001
    invoke-static {v0, v4, p1}, Ll/۫۠ᩴ;->ۙ(ILl/ܽ֡֫;Ljava/lang/String;)V

    :cond_9
    return v2

    :cond_a
    const v1, 0x7f0a037a

    if-ne v0, v1, :cond_b

    .line 1004
    invoke-static {p1, v3}, Ll/᩹۬᩸;->ۙ(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return v2

    .line 1005
    :cond_b
    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    instance-of v0, p1, Ll/ۤ֫ᩴ;

    if-eqz v0, :cond_c

    check-cast p1, Ll/ۤ֫ᩴ;

    .line 1006
    invoke-virtual {p1}, Ll/ۤ֫ᩴ;->ۙ()Ll/᩸֫ᩴ;

    move-result-object p1

    invoke-virtual {p1, v3}, Ll/᩸֫ᩴ;->ۙ(Ll/᩺ۜ᩸;)V

    return v2

    :cond_c
    return v5
.end method

.method public final ᩸()V
    .locals 5

    .line 828
    invoke-direct {p0}, Ll/᩹۬᩸;->ܶ()V

    .line 829
    iget-object v0, p0, Ll/᩹۬᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->֨ۤ()V

    .line 830
    iget-object v1, p0, Ll/᩹۬᩸;->᩺:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v1}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 831
    iget-object v1, p0, Ll/᩹۬᩸;->ۘ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-nez v2, :cond_0

    .line 832
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 833
    invoke-direct {p0}, Ll/᩹۬᩸;->ۗ()V

    .line 834
    iget-object v1, p0, Ll/᩹۬᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ܳ()V

    .line 836
    :cond_0
    iget-object v1, p0, Ll/᩹۬᩸;->ۨ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    .line 837
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 838
    iget-object v1, p0, Ll/᩹۬᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ܳ()V

    .line 840
    :cond_1
    sget-boolean v1, Ll/᩹۬᩸;->ۢ:Z

    if-eqz v1, :cond_2

    .line 841
    iget-object v1, p0, Ll/᩹۬᩸;->ᩴ:Ll/ܽ᩶᩻;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 842
    iget-object v1, p0, Ll/᩹۬᩸;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Paint;->isUnderlineText()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 843
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 844
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 847
    :cond_2
    iget-object v1, p0, Ll/᩹۬᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 848
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final ᩻()V
    .locals 2

    .line 852
    invoke-direct {p0}, Ll/᩹۬᩸;->ܶ()V

    .line 853
    iget-object v0, p0, Ll/᩹۬᩸;->ܰ:Ll/۬ۖۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 854
    invoke-direct {p0}, Ll/᩹۬᩸;->᩹()V

    return-void
.end method
