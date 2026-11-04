.class public final Ll/۠ܶۚ;
.super Ll/᩷᩸ۤ;
.source "W6LU"


# instance fields
.field public final ֡:Ll/ۖܳۤ;

.field public final ֨:Ljava/util/HashMap;

.field public final ۟:Z

.field public ۢ:I

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/ܳ۫ۤ;Ll/ۖܳۤ;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 5

    .line 224
    move-object v0, p1

    check-cast v0, Ll/ܰ᩸ۤ;

    invoke-direct {p0, v0}, Ll/᩷᩸ۤ;-><init>(Ll/ܰ᩸ۤ;)V

    .line 216
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۠ܶۚ;->ܿ:Ljava/util/HashMap;

    .line 217
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۠ܶۚ;->֨:Ljava/util/HashMap;

    .line 219
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۠ܶۚ;->ᩳ:Ljava/util/HashSet;

    .line 225
    iput-object p2, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    const-string v0, "RESOURCE_PATCH_CORRUPT"

    if-nez p2, :cond_1

    :try_start_0
    const-string v1, "default"

    .line 227
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p3

    :goto_0
    check-cast p1, Ll/ܰ᩸ۤ;

    invoke-virtual {p1}, Ll/ܰ᩸ۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object p1

    check-cast p1, Ll/ܶ᩸ۤ;

    invoke-virtual {p1}, Ll/ܶ᩸ۤ;->ۙ᩷()Ll/ܿۤۤ;

    move-result-object p1

    invoke-static {v1, p1}, Ll/᩵ۤۤ;->ۙ(Ljava/lang/String;Ll/ܿۤۤ;)Ll/᩵ۤۤ;

    move-result-object p1

    goto :goto_1

    .line 228
    :cond_1
    invoke-interface {p2}, Ll/ۖܳۤ;->۬()Ll/᩵ۤۤ;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Ll/᩷᩸ۤ;->᩶:Ll/᩵ۤۤ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    invoke-static {p0}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 236
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, 0x0

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const v2, 0xffff

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܶۚ;

    .line 237
    invoke-virtual {v1}, Ll/֨ܶۚ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p3, 0x1

    goto :goto_2

    .line 238
    :cond_3
    invoke-virtual {v1}, Ll/֨ܶۚ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Ll/۠ܶۚ;->ᩳ:Ljava/util/HashSet;

    iget v1, v1, Ll/֨ܶۚ;->۫:I

    and-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 240
    :cond_4
    iput-boolean p3, p0, Ll/۠ܶۚ;->۟:Z

    if-nez p2, :cond_5

    const/4 p1, -0x1

    goto :goto_3

    .line 241
    :cond_5
    invoke-interface {p2}, Ll/ۖܳۤ;->ۛ()I

    move-result p1

    :goto_3
    iput p1, p0, Ll/۠ܶۚ;->ۢ:I

    .line 242
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֨ܶۚ;

    .line 243
    invoke-virtual {p3}, Ll/֨ܶۚ;->ۤ()Z

    move-result p4

    if-eqz p4, :cond_6

    goto :goto_4

    .line 244
    :cond_6
    iget p4, p3, Ll/֨ܶۚ;->۫:I

    and-int/2addr p4, v2

    .line 245
    iget v1, p0, Ll/۠ܶۚ;->ۢ:I

    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/۠ܶۚ;->ۢ:I

    .line 246
    invoke-virtual {p3}, Ll/֨ܶۚ;->᩷()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    .line 247
    :cond_7
    iget-object v1, p0, Ll/۠ܶۚ;->֨:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p3, Ll/֨ܶۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    iget-boolean v1, p0, Ll/۠ܶۚ;->۟:Z

    if-nez v1, :cond_8

    iget-object v1, p0, Ll/۠ܶۚ;->ᩳ:Ljava/util/HashSet;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    if-eqz p2, :cond_8

    invoke-interface {p2, p4}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    iget-object v1, p0, Ll/۠ܶۚ;->ܿ:Ljava/util/HashMap;

    .line 249
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 250
    iget-object v1, p0, Ll/۠ܶۚ;->ܿ:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object p3, p3, Ll/֨ܶۚ;->ۤ:[B

    invoke-static {p0, p4, p3}, Ll/ۘܽۚ;->ۙ(Ll/ۖܳۤ;I[B)Ll/ۨܽۚ;

    move-result-object p3

    invoke-virtual {v1, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    const-string p1, "Added resource variant already exists."

    .line 264
    invoke-static {v0, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 249
    throw p1

    :cond_a
    return-void

    :cond_b
    const-string p1, "Resource patch variant is not canonical."

    .line 264
    invoke-static {v0, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 233
    throw p1

    :catch_0
    const-string p1, "Resource patch variant is invalid."

    .line 264
    invoke-static {v0, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 230
    throw p1
.end method


# virtual methods
.method public final ֫᩷()Z
    .locals 1

    .line 257
    iget-object v0, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۖܳۤ;->֫᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۛ()I
    .locals 1

    .line 254
    iget v0, p0, Ll/۠ܶۚ;->ۢ:I

    return v0
.end method

.method public final ۤ(I)Ljava/lang/String;
    .locals 2

    .line 258
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/۠ܶۚ;->֨:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    iget-object v0, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {v0, p1}, Ll/ۖܳۤ;->ۤ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۨۙ()Z
    .locals 1

    .line 256
    iget-object v0, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۖܳۤ;->ۨۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ(I)Z
    .locals 2

    .line 255
    iget-object v0, p0, Ll/۠ܶۚ;->ܿ:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/۠ܶۚ;->۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠ܶۚ;->ᩳ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(I)Ll/۠ܳۤ;
    .locals 2

    .line 259
    invoke-virtual {p0, p1}, Ll/۠ܶۚ;->ܺ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/۠ܶۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܳۤ;

    return-object p1

    :cond_1
    iget-object v0, p0, Ll/۠ܶۚ;->֡:Ll/ۖܳۤ;

    invoke-interface {v0, p1}, Ll/ۖܳۤ;->᩷(I)Ll/۠ܳۤ;

    move-result-object p1

    return-object p1
.end method
