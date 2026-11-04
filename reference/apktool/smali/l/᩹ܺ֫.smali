.class public final Ll/᩹ܺ֫;
.super Ljava/lang/Object;
.source "F6JI"


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ۤ:Ljava/util/List;

.field public final ۫:I

.field public final ܳ:Ll/ܳۧ֫;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:I

.field public final ᩸:I


# direct methods
.method public synthetic constructor <init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/ArrayList;Ljava/util/ArrayList;I)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p7}, Ll/᩹ܺ֫;-><init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/List;Ljava/util/List;I)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/᩹ܺ֫;->ܳ:Ll/ܳۧ֫;

    iput-object p2, p0, Ll/᩹ܺ֫;->ᩴ:Ljava/lang/String;

    iput p3, p0, Ll/᩹ܺ֫;->۫:I

    iput p4, p0, Ll/᩹ܺ֫;->᩷:I

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ܺ֫;->ۙ:Ljava/util/List;

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ܺ֫;->ۤ:Ljava/util/List;

    .line 49
    iput p7, p0, Ll/᩹ܺ֫;->᩸:I

    return-void
.end method

.method public static ۙ(I)Ll/᩹ܺ֫;
    .locals 9

    .line 61
    new-instance v8, Ll/᩹ܺ֫;

    const/4 v4, 0x0

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v8

    move-object v5, v6

    move v7, p0

    invoke-direct/range {v0 .. v7}, Ll/᩹ܺ֫;-><init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/List;Ljava/util/List;I)V

    return-object v8
.end method


# virtual methods
.method public final ۙ(Ll/ۡ֫֫;)Ll/᩹ܺ֫;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_9

    .line 66
    iget v2, v1, Ll/ۡ֫֫;->ۤ:I

    iget v3, v1, Ll/ۡ֫֫;->֫:I

    iget-object v4, v0, Ll/᩹ܺ֫;->ܳ:Ll/ܳۧ֫;

    if-eqz v4, :cond_9

    iget-object v5, v1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    invoke-virtual {v4, v5}, Ll/ܳۧ֫;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_4

    :cond_0
    const/4 v4, 0x0

    .line 67
    iget v5, v0, Ll/᩹ܺ֫;->᩷:I

    iget v6, v0, Ll/᩹ܺ֫;->۫:I

    if-lez v6, :cond_1

    if-gtz v5, :cond_2

    :cond_1
    if-lez v3, :cond_2

    if-lez v2, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 68
    :goto_0
    iget-object v8, v0, Ll/᩹ܺ֫;->ᩴ:Ljava/lang/String;

    if-nez v8, :cond_3

    iget-object v9, v1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    move-object v12, v9

    goto :goto_1

    :cond_3
    move-object v12, v8

    :goto_1
    if-nez v7, :cond_4

    if-nez v8, :cond_9

    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    if-eqz v7, :cond_8

    .line 72
    iget v1, v1, Ll/ۡ֫֫;->ᩴ:I

    const/4 v5, 0x5

    if-lt v1, v5, :cond_5

    const/16 v5, 0x8

    if-gt v1, v5, :cond_5

    const/4 v4, 0x1

    :cond_5
    if-eqz v4, :cond_6

    move v6, v2

    goto :goto_2

    :cond_6
    move v6, v3

    :goto_2
    if-eqz v4, :cond_7

    move v2, v3

    :cond_7
    move v14, v2

    goto :goto_3

    :cond_8
    move v14, v5

    :goto_3
    move v13, v6

    .line 76
    new-instance v1, Ll/᩹ܺ֫;

    iget-object v2, v0, Ll/᩹ܺ֫;->ۤ:Ljava/util/List;

    iget v3, v0, Ll/᩹ܺ֫;->᩸:I

    iget-object v11, v0, Ll/᩹ܺ֫;->ܳ:Ll/ܳۧ֫;

    iget-object v15, v0, Ll/᩹ܺ֫;->ۙ:Ljava/util/List;

    move-object v10, v1

    move-object/from16 v16, v2

    move/from16 v17, v3

    invoke-direct/range {v10 .. v17}, Ll/᩹ܺ֫;-><init>(Ll/ܳۧ֫;Ljava/lang/String;IILjava/util/List;Ljava/util/List;I)V

    return-object v1

    :cond_9
    :goto_4
    return-object v0
.end method
