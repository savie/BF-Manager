.class public final synthetic Ll/ۚۘۘ;
.super Ljava/lang/Object;
.source "A7L5"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Comparable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ۚۘۘ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۘۘ;->᩶:Ljava/lang/Comparable;

    return-void
.end method

.method public synthetic constructor <init>(Ll/۟ᩴ᩵;Ll/ۖۡۗ;)V
    .locals 0

    const/4 p1, 0x1

    .line 0
    iput p1, p0, Ll/ۚۘۘ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۚۘۘ;->᩶:Ljava/lang/Comparable;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    iget v0, p0, Ll/ۚۘۘ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ll/ᩳۧۗ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۧۗ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 6

    .line 2
    iget v0, p0, Ll/ۚۘۘ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۚۘۘ;->᩶:Ljava/lang/Comparable;

    .line 9
    check-cast v0, Ll/ۖۡۗ;

    .line 11
    check-cast p1, Ll/ۛ֨ۗ;

    .line 135
    sget-object v1, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    goto/16 :goto_1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۚۘۘ;->᩶:Ljava/lang/Comparable;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ll/۫ۘۘ;

    invoke-static {v0, p1}, Ll/֫ۘۘ;->ۙ(Ljava/lang/String;Ll/۫ۘۘ;)Z

    move-result p1

    return p1

    .line 139
    :cond_0
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 141
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_2

    sget-object v4, Ll/ۧ۟ۗ;->֡:Ll/ۧ۟ۗ;

    .line 142
    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 143
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v0

    move-object v4, v2

    check-cast v4, Ll/ۜ֨ۗ;

    .line 52
    invoke-virtual {v0, v4}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v0

    .line 53
    instance-of v4, v0, Ll/ۖۡۗ;

    if-eqz v4, :cond_1

    .line 54
    check-cast v0, Ll/ۖۡۗ;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 144
    sget-object v4, Ll/ۧ۟ۗ;->ۙۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v4}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 145
    invoke-virtual {v2, p1}, Ll/ᩳۡۗ;->ۤ(Ll/ܺ֨ۗ;)I

    move-result v2

    .line 146
    invoke-virtual {v0}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v0

    if-ltz v2, :cond_2

    .line 147
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 148
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 149
    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 189
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 150
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    return v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
