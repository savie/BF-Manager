.class public final Ll/۬ܶۚ;
.super Ll/ܰ᩸ۤ;
.source "W6LU"


# instance fields
.field public final ۟:Ll/ܳ۫ۤ;

.field public ۢ:I

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۤ۫ۤ;Ll/ܳ۫ۤ;ILjava/util/ArrayList;)V
    .locals 11

    .line 130
    check-cast p1, Ll/ܶ᩸ۤ;

    invoke-direct {p0, p1, p3}, Ll/ܰ᩸ۤ;-><init>(Ll/ܶ᩸ۤ;I)V

    .line 125
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    .line 131
    iput-object p2, p0, Ll/۬ܶۚ;->۟:Ll/ܳ۫ۤ;

    const/4 p1, 0x0

    if-nez p2, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 132
    :cond_0
    invoke-interface {p2}, Ll/ܳ۫ۤ;->֫()I

    move-result p3

    :goto_0
    iput p3, p0, Ll/۬ܶۚ;->ۢ:I

    .line 133
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 135
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0xffff

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ܶۚ;

    .line 136
    invoke-virtual {v2}, Ll/֨ܶۚ;->ۤ()Z

    move-result v4

    iget-object v5, v2, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 137
    invoke-virtual {p3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    iget v3, p0, Ll/۬ܶۚ;->ۢ:I

    iget v2, v2, Ll/֨ܶۚ;->ۧ:I

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, p0, Ll/۬ܶۚ;->ۢ:I

    goto :goto_1

    .line 139
    :cond_2
    invoke-virtual {v2}, Ll/֨ܶۚ;->᩷()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 140
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/BitSet;

    if-nez v4, :cond_3

    .line 141
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    :cond_3
    iget v2, v2, Ll/֨ܶۚ;->۫:I

    and-int/2addr v2, v3

    invoke-virtual {v4, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    .line 145
    :cond_4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 146
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨ܶۚ;

    .line 147
    invoke-virtual {p0}, Ll/ܰ᩸ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Ll/֨ܶۚ;->᩻:Ljava/lang/String;

    iget-object v7, v4, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "RESOURCE_PATCH_CORRUPT"

    if-eqz v5, :cond_d

    .line 148
    invoke-virtual {v4}, Ll/֨ܶۚ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    .line 149
    :cond_6
    iget v5, v4, Ll/֨ܶۚ;->۫:I

    and-int/2addr v5, v3

    .line 150
    iget v8, p0, Ll/۬ܶۚ;->ۢ:I

    add-int/lit8 v9, v5, 0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    iput v8, p0, Ll/۬ܶۚ;->ۢ:I

    .line 152
    invoke-virtual {v4}, Ll/֨ܶۚ;->᩷()Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    .line 153
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_9

    .line 154
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string p1, "Resource patch entry names differ."

    .line 264
    invoke-static {v6, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 155
    throw p1

    :cond_9
    :goto_3
    if-eqz p2, :cond_5

    .line 158
    invoke-interface {p2}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۖܳۤ;

    .line 159
    invoke-static {v8}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v9

    .line 160
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/BitSet;

    .line 161
    invoke-virtual {p3, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    if-eqz v10, :cond_b

    invoke-virtual {v10, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_4

    .line 162
    :cond_b
    invoke-interface {v8, v5}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8, v5}, Ll/ۖܳۤ;->ۤ(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_4

    :cond_c
    const-string p1, "Resource patch entry name differs from existing variants."

    .line 264
    invoke-static {v6, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 163
    throw p1

    :cond_d
    const-string p1, "Resource patch type name differs."

    .line 264
    invoke-static {v6, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 147
    throw p1

    .line 168
    :cond_e
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x1

    if-eqz p2, :cond_12

    .line 170
    invoke-interface {p2}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܳۤ;

    .line 171
    invoke-static {v1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v2

    .line 172
    invoke-static {v2, p4}, Ll/۬ܶۚ;->ۙ(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    .line 173
    invoke-virtual {p3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_6

    .line 189
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v0, :cond_10

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨ܶۚ;

    invoke-virtual {v4}, Ll/֨ܶۚ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_5

    .line 176
    :cond_10
    iget-object v4, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    new-instance v5, Ll/۠ܶۚ;

    invoke-direct {v5, p0, v1, v2, v3}, Ll/۠ܶۚ;-><init>(Ll/ܳ۫ۤ;Ll/ۖܳۤ;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 174
    :cond_11
    :goto_6
    iget-object v2, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 180
    :cond_12
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_13
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܶۚ;

    .line 181
    iget-object v1, v1, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 182
    invoke-static {v1, p4}, Ll/۬ܶۚ;->ۙ(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v0, :cond_14

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ܶۚ;

    invoke-virtual {v3}, Ll/֨ܶۚ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_7

    .line 183
    :cond_14
    iget-object v3, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    new-instance v4, Ll/۠ܶۚ;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5, v1, v2}, Ll/۠ܶۚ;-><init>(Ll/ܳ۫ۤ;Ll/ۖܳۤ;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_15
    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 202
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܶۚ;

    iget-object v2, v1, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 206
    iget v0, p0, Ll/۬ܶۚ;->ۢ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 197
    iget-object v0, p0, Ll/۬ܶۚ;->۟:Ll/ܳ۫ۤ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {v0, p1}, Ll/ܳ۫ۤ;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ۚۙ()I
    .locals 1

    .line 207
    iget-object v0, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ()Ljava/lang/Iterable;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧۙ()V
    .locals 0

    return-void
.end method

.method public final ܳ(I)Z
    .locals 1

    .line 193
    iget-object v0, p0, Ll/۬ܶۚ;->۟:Ll/ܳ۫ۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/ܳ۫ۤ;->ܳ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ(I)Ll/ۖܳۤ;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/۬ܶۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܳۤ;

    return-object p1
.end method
