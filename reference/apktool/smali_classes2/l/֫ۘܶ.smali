.class public final Ll/֫ۘܶ;
.super Ljava/lang/Object;
.source "I1MH"


# instance fields
.field public final synthetic ۙ:I

.field public ᩷:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    iput v1, v0, Ll/֫ۘܶ;->ۙ:I

    packed-switch v1, :pswitch_data_0

    .line 33
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, v0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_0
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x927c0

    sub-long v3, v1, v3

    const-wide/32 v5, 0x36ee80

    sub-long v5, v1, v5

    .line 14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    const/16 v8, 0xb

    const/4 v9, 0x0

    .line 15
    invoke-virtual {v7, v8, v9}, Ljava/util/Calendar;->set(II)V

    const/16 v8, 0xc

    .line 16
    invoke-virtual {v7, v8, v9}, Ljava/util/Calendar;->set(II)V

    const/16 v8, 0xd

    .line 17
    invoke-virtual {v7, v8, v9}, Ljava/util/Calendar;->set(II)V

    const/16 v8, 0xe

    .line 18
    invoke-virtual {v7, v8, v9}, Ljava/util/Calendar;->set(II)V

    .line 19
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    const/16 v8, 0xa

    const/16 v12, -0x18

    .line 20
    invoke-virtual {v7, v8, v12}, Ljava/util/Calendar;->add(II)V

    .line 21
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    const-wide/32 v12, 0x240c8400

    sub-long v12, v1, v12

    const-wide v14, 0x9a7ec800L

    sub-long/2addr v1, v14

    const/4 v14, 0x6

    new-array v14, v14, [J

    aput-wide v3, v14, v9

    const/4 v3, 0x1

    aput-wide v5, v14, v3

    const/4 v3, 0x2

    aput-wide v10, v14, v3

    const/4 v3, 0x3

    aput-wide v7, v14, v3

    const/4 v3, 0x4

    aput-wide v12, v14, v3

    const/4 v3, 0x5

    aput-wide v1, v14, v3

    .line 24
    iput-object v14, v0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ll/ܺۘܶ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/֫ۘܶ;->ۙ:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/֫ۘܶ;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 76
    :pswitch_0
    iget-object v0, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(J)I
    .locals 6

    .line 28
    iget-object v0, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    check-cast v0, [J

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 30
    aget-wide v3, v0, v2

    cmp-long v5, p1, v3

    if-lez v5, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۙ()Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    return-object v0
.end method

.method public ۙ(I)Ll/֨ۨۙ;
    .locals 4

    .line 45
    iget-object v0, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۨۙ;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ll/֨ۨۙ;

    const-wide v2, 0x7ffffffffffffffeL

    invoke-direct {v1, v2, v3}, Ll/֨ۨۙ;-><init>(J)V

    .line 48
    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public ᩷()V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/֫ۘܶ;->᩷:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method
