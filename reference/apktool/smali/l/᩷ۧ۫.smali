.class public final Ll/᩷ۧ۫;
.super Ljava/lang/Object;
.source "D6J2"


# instance fields
.field public final ۙ:Ll/᩷ۨᩴ;

.field public final ۤ:Ll/۫ۘܳ;

.field public final ᩷:Ljava/util/List;

.field public final ᩸:Ll/۫ۖ۫;


# direct methods
.method public constructor <init>(Ll/᩷ۨᩴ;Ll/۫ۘܳ;Ljava/util/List;Ll/۫ۖ۫;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/᩷ۧ۫;->ۙ:Ll/᩷ۨᩴ;

    .line 31
    iput-object p2, p0, Ll/᩷ۧ۫;->ۤ:Ll/۫ۘܳ;

    .line 32
    iput-object p3, p0, Ll/᩷ۧ۫;->᩷:Ljava/util/List;

    .line 33
    iput-object p4, p0, Ll/᩷ۧ۫;->᩸:Ll/۫ۖ۫;

    return-void
.end method

.method public static ۙ([Ljava/lang/String;Ll/᩸ۧ۫;Ll/᩻ۚ۫;)Ljava/util/ArrayList;
    .locals 10

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    new-instance v1, Ll/᩸ۧ۫;

    invoke-direct {v1}, Ll/᩸ۧ۫;-><init>()V

    .line 41
    array-length v2, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_7

    aget-object v5, p0, v4

    .line 42
    invoke-virtual {p2}, Ll/ᩳۜۧ;->۫()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_6

    :cond_0
    new-array v6, v3, [Ljava/lang/String;

    .line 45
    invoke-static {v5, v6}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v5

    .line 46
    invoke-virtual {v1, v5}, Ll/᩸ۧ۫;->᩷(Ll/᩷ۨᩴ;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_5

    .line 62
    :cond_1
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    .line 63
    invoke-virtual {v6}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v8

    sget-object v9, Ll/᩻ܳ᩸;->᩶:Ll/᩻ܳ᩸;

    if-ne v8, v9, :cond_2

    .line 64
    new-instance v6, Ll/᩷ۧ۫;

    sget-object v8, Ll/۫ۘܳ;->֡:Ll/۫ۘܳ;

    .line 65
    invoke-static {v5}, Ll/ۚ۫᩸;->ۙ(Ll/᩷ۨᩴ;)Ljava/util/List;

    move-result-object v9

    invoke-direct {v6, v5, v8, v9, v7}, Ll/᩷ۧ۫;-><init>(Ll/᩷ۨᩴ;Ll/۫ۘܳ;Ljava/util/List;Ll/۫ۖ۫;)V

    goto :goto_3

    :cond_2
    if-eqz v6, :cond_3

    .line 68
    invoke-virtual {v6}, Ll/ܺܳ᩸;->᩷()Ll/᩻ܳ᩸;

    move-result-object v6

    sget-object v8, Ll/᩻ܳ᩸;->֡:Ll/᩻ܳ᩸;

    if-ne v6, v8, :cond_3

    .line 69
    sget-object v6, Ll/۫ۘܳ;->֨:Ll/۫ۘܳ;

    goto :goto_1

    :cond_3
    invoke-static {v5}, Ll/֫ۘܳ;->ۙ(Ll/᩷ۨᩴ;)Ll/۫ۘܳ;

    move-result-object v6

    .line 70
    :goto_1
    sget-object v8, Ll/۫ۘܳ;->ᩳ:Ll/۫ۘܳ;

    if-ne v6, v8, :cond_4

    .line 71
    invoke-static {v5}, Ll/۫ۖ۫;->ۙ(Ll/᩷ۨᩴ;)Ll/۫ۖ۫;

    move-result-object v7

    .line 72
    new-instance v8, Ll/᩷ۧ۫;

    invoke-virtual {v7}, Ll/۫ۖ۫;->ۙ()Ljava/util/List;

    move-result-object v9

    invoke-direct {v8, v5, v6, v9, v7}, Ll/᩷ۧ۫;-><init>(Ll/᩷ۨᩴ;Ll/۫ۘܳ;Ljava/util/List;Ll/۫ۖ۫;)V

    move-object v6, v8

    goto :goto_3

    .line 74
    :cond_4
    sget-object v8, Ll/۫ۘܳ;->֨:Ll/۫ۘܳ;

    if-ne v6, v8, :cond_5

    .line 75
    invoke-static {v5}, Ll/᩸ܽܺ;->ۙ(Ll/᩷ۨᩴ;)[B

    move-result-object v8

    invoke-static {v5, v8}, Ll/᩸ۧ۫;->᩷(Ll/᩷ۨᩴ;[B)Ljava/util/List;

    move-result-object v8

    goto :goto_2

    .line 76
    :cond_5
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 77
    :goto_2
    new-instance v9, Ll/᩷ۧ۫;

    invoke-direct {v9, v5, v6, v8, v7}, Ll/᩷ۧ۫;-><init>(Ll/᩷ۨᩴ;Ll/۫ۘܳ;Ljava/util/List;Ll/۫ۖ۫;)V

    move-object v6, v9

    .line 50
    :goto_3
    invoke-virtual {v1, v5}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    .line 51
    invoke-virtual {p1, v5}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    .line 52
    iget-object v5, v6, Ll/᩷ۧ۫;->᩷:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۨᩴ;

    .line 53
    invoke-virtual {v1, v7}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    .line 54
    invoke-virtual {p1, v7}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    goto :goto_4

    .line 56
    :cond_6
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_7
    :goto_6
    return-object v0
.end method
