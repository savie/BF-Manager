.class public final Ll/ۧܺ᩵;
.super Ljava/lang/Object;
.source "3IUS"

# interfaces
.implements Ll/ۢܰۗ;


# instance fields
.field public final ۙ:Ll/ۛܺ᩵;

.field public final ᩷:Ll/ۨܺ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Ll/ۧܺ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۨܺ᩵;Ll/ۛܺ᩵;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    .line 33
    iput-object p2, p0, Ll/ۧܺ᩵;->ۙ:Ll/ۛܺ᩵;

    return-void
.end method

.method private ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/ܺܺ᩵;ILjava/util/Map;Z)V
    .locals 6

    const/4 v0, 0x0

    .line 131
    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    if-eqz p6, :cond_1

    invoke-virtual {p2}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v2

    const/16 v3, 0x1c

    .line 98
    invoke-virtual {v1, v3}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    if-nez v3, :cond_0

    .line 188
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 190
    :cond_0
    invoke-virtual {v2, v3}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 191
    iget-object v3, p0, Ll/ۧܺ᩵;->ۙ:Ll/ۛܺ᩵;

    invoke-virtual {v3, v2}, Ll/ۛܺ᩵;->ۙ(Ll/ۨܺ᩵;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, p4, :cond_4

    .line 306
    invoke-static {p2}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {p2}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v5

    .line 136
    invoke-virtual {v1, p3, v4}, Ll/ۨܺ᩵;->ۙ(Ll/ܺܺ᩵;I)I

    .line 137
    invoke-virtual {p3, v5}, Ll/ܺܺ᩵;->ۙ(I)V

    .line 181
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p5, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    .line 182
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 138
    :goto_2
    invoke-virtual {p3, v5}, Ll/ܺܺ᩵;->᩷(I)V

    if-eqz p6, :cond_3

    .line 139
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩶ۗ;

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    invoke-virtual {p3, v5}, Ll/ܺܺ᩵;->ۙ(Ll/ܳ᩶ۗ;)V

    .line 140
    invoke-virtual {p1, p3}, Ll/ۡ᩶ۗ;->accept(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method private ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/᩹ܺ᩵;ILjava/util/Map;Ljava/util/Map;)V
    .locals 7

    .line 156
    new-instance v0, Ll/᩻ܺ᩵;

    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/᩻ܺ᩵;-><init>(Ll/ۨܺ᩵;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p4, :cond_3

    .line 306
    invoke-static {p2}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {p2}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    invoke-static {p2}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v5

    .line 163
    invoke-virtual {p3}, Ll/᩹ܺ᩵;->ۙ()Ll/᩵ܺ᩵;

    move-result-object v6

    .line 164
    invoke-virtual {v6}, Ll/᩵ܺ᩵;->ۧ()V

    .line 165
    invoke-virtual {v1, v3, v6}, Ll/ۨܺ᩵;->ۙ(ILl/᩵ܺ᩵;)V

    .line 166
    invoke-virtual {p3, v4}, Ll/᩹ܺ᩵;->ۙ(I)V

    if-nez v5, :cond_0

    const/4 v4, 0x0

    .line 168
    invoke-virtual {p3, v4}, Ll/᩹ܺ᩵;->ۙ(Ll/᩻ܺ᩵;)V

    goto :goto_1

    .line 170
    :cond_0
    invoke-virtual {v0, v3}, Ll/᩻ܺ᩵;->ۙ(I)V

    .line 171
    invoke-virtual {v0, v5}, Ll/᩻ܺ᩵;->᩷(I)V

    .line 172
    invoke-virtual {p3, v0}, Ll/᩹ܺ᩵;->ۙ(Ll/᩻ܺ᩵;)V

    .line 181
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    .line 182
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    .line 174
    :goto_2
    invoke-virtual {p3, v4}, Ll/᩹ܺ᩵;->᩷(I)V

    .line 181
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    .line 182
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    .line 175
    :goto_3
    invoke-virtual {p3, v4}, Ll/᩹ܺ᩵;->ۤ(I)V

    .line 176
    invoke-virtual {p1, p3}, Ll/ۡ᩶ۗ;->accept(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final copy()Ll/ۧܺ᩵;
    .locals 3

    .line 44
    new-instance v0, Ll/ۧܺ᩵;

    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v1

    iget-object v2, p0, Ll/ۧܺ᩵;->ۙ:Ll/ۛܺ᩵;

    invoke-virtual {v2}, Ll/ۛܺ᩵;->ۙ()Ll/ۛܺ᩵;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۧܺ᩵;-><init>(Ll/ۨܺ᩵;Ll/ۛܺ᩵;)V

    return-object v0
.end method

.method public final getAttributes()Ljava/util/ArrayList;
    .locals 4

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, 0x10

    .line 80
    iget-object v2, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v2, v1}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v2}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    .line 81
    invoke-virtual {v2, v1}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 203
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 204
    new-instance v3, Ll/᩶᩶ۗ;

    invoke-direct {v3, v1}, Ll/᩶᩶ۗ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_0
    invoke-virtual {p0}, Ll/ۧܺ᩵;->getType()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x14

    .line 90
    invoke-virtual {v2, v3}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v2}, Ll/ۨܺ᩵;->ۚ()I

    move-result v2

    .line 195
    iget-object v3, p0, Ll/ۧܺ᩵;->ۙ:Ll/ۛܺ᩵;

    invoke-virtual {v3, v2}, Ll/ۛܺ᩵;->ۤ(I)V

    .line 196
    invoke-virtual {v3}, Ll/ۛܺ᩵;->᩷()Ljava/util/List;

    move-result-object v2

    .line 206
    invoke-static {v1, v0, v2}, Ll/֫ܺ᩵;->᩷(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 49
    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 50
    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Unknown class type"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 212
    invoke-virtual {p0}, Ll/ۧܺ᩵;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x8

    .line 65
    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 66
    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۡ᩶ۗ;Ll/ۡ᩶ۗ;)V
    .locals 18

    move-object/from16 v7, p0

    const/16 v0, 0x18

    .line 94
    iget-object v1, v7, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 107
    :cond_0
    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->᩷(I)Ll/ۨܺ᩵;

    move-result-object v8

    .line 306
    invoke-static {v8}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    invoke-static {v8}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v9

    invoke-static {v8}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v10

    invoke-static {v8}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v11

    add-int v0, v4, v9

    move-object/from16 v12, p1

    .line 113
    invoke-virtual {v12, v0}, Ll/ۡ᩶ۗ;->ۙ(I)V

    add-int v0, v10, v11

    move-object/from16 v13, p2

    .line 114
    invoke-virtual {v13, v0}, Ll/ۡ᩶ۗ;->ۙ(I)V

    const/16 v0, 0x14

    .line 90
    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 116
    iget-object v14, v7, Ll/ۧܺ᩵;->ۙ:Ll/ۛܺ᩵;

    invoke-virtual {v14, v0}, Ll/ۛܺ᩵;->ۤ(I)V

    .line 122
    invoke-virtual {v14}, Ll/ۛܺ᩵;->ۤ()Ljava/util/Map;

    move-result-object v15

    .line 123
    new-instance v6, Ll/ܺܺ᩵;

    invoke-direct {v6, v14}, Ll/ܺܺ᩵;-><init>(Ll/ۛܺ᩵;)V

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ۧܺ᩵;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ܺܺ᩵;->᩷(Ljava/lang/String;)V

    const/16 v16, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v8

    move-object v3, v6

    move-object v5, v15

    move-object/from16 v17, v6

    move/from16 v6, v16

    .line 125
    invoke-direct/range {v0 .. v6}, Ll/ۧܺ᩵;->ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/ܺܺ᩵;ILjava/util/Map;Z)V

    const/4 v6, 0x0

    move-object/from16 v3, v17

    move v4, v9

    .line 126
    invoke-direct/range {v0 .. v6}, Ll/ۧܺ᩵;->ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/ܺܺ᩵;ILjava/util/Map;Z)V

    .line 145
    new-instance v9, Ll/᩹ܺ᩵;

    invoke-direct {v9, v14}, Ll/᩹ܺ᩵;-><init>(Ll/ۛܺ᩵;)V

    .line 146
    new-instance v0, Ll/᩵ܺ᩵;

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-virtual {v9, v0}, Ll/᩹ܺ᩵;->ۙ(Ll/᩵ܺ᩵;)V

    .line 147
    invoke-virtual {v14}, Ll/ۛܺ᩵;->ᩴ()Ljava/util/Map;

    move-result-object v12

    .line 148
    invoke-virtual {v14}, Ll/ۛܺ᩵;->᩸()Ljava/util/Map;

    move-result-object v14

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object v3, v9

    move v4, v10

    move-object v5, v12

    move-object v6, v14

    .line 150
    invoke-direct/range {v0 .. v6}, Ll/ۧܺ᩵;->ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/᩹ܺ᩵;ILjava/util/Map;Ljava/util/Map;)V

    move v4, v11

    .line 151
    invoke-direct/range {v0 .. v6}, Ll/ۧܺ᩵;->ۙ(Ll/ۡ᩶ۗ;Ll/ۨܺ᩵;Ll/᩹ܺ᩵;ILjava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩸()Ll/֫᩻᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩻᩵;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()I
    .locals 2

    const/4 v0, 0x4

    .line 59
    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    return v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 2

    const/16 v0, 0xc

    .line 71
    iget-object v1, p0, Ll/ۧܺ᩵;->᩷:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    if-nez v0, :cond_0

    .line 73
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 75
    :cond_0
    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۙ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ܺ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
