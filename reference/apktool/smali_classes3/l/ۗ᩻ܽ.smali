.class public final Ll/ۗ᩻ܽ;
.super Ll/᩺᩻ܽ;
.source "O5F3"


# instance fields
.field public final synthetic ֡:Ll/᩺᩻ܽ;

.field public final ܿ:Ll/ۖ֫ܽ;


# direct methods
.method public constructor <init>(Ll/᩺᩻ܽ;Ll/ۖ֫ܽ;)V
    .locals 3

    .line 876
    iput-object p1, p0, Ll/ۗ᩻ܽ;->֡:Ll/᩺᩻ܽ;

    .line 877
    new-instance v0, Ll/ۛ᩻ܽ;

    .line 879
    invoke-static {}, Ll/ۖ֫ܽ;->᩸()Ll/ۖ֫ܽ;

    move-result-object v1

    iget-object p1, p1, Ll/᩺᩻ܽ;->᩶:Ljava/util/AbstractMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, p1, v2}, Ll/ۛ᩻ܽ;-><init>(Ll/ۖ֫ܽ;Ll/ۖ֫ܽ;Ljava/util/NavigableMap;I)V

    .line 877
    invoke-direct {p0, v0, v2}, Ll/᩺᩻ܽ;-><init>(Ljava/util/NavigableMap;I)V

    .line 880
    iput-object p2, p0, Ll/ۗ᩻ܽ;->ܿ:Ll/ۖ֫ܽ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Integer;)Ll/ۖ֫ܽ;
    .locals 2

    .line 894
    iget-object v0, p0, Ll/ۗ᩻ܽ;->ܿ:Ll/ۖ֫ܽ;

    invoke-virtual {v0, p1}, Ll/ۖ֫ܽ;->ۙ(Ljava/lang/Comparable;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 897
    :cond_0
    iget-object v1, p0, Ll/ۗ᩻ܽ;->֡:Ll/᩺᩻ܽ;

    invoke-virtual {v1, p1}, Ll/᩺᩻ܽ;->ۙ(Ljava/lang/Integer;)Ll/ۖ֫ܽ;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 898
    :cond_1
    invoke-virtual {p1, v0}, Ll/ۖ֫ܽ;->᩷(Ll/ۖ֫ܽ;)Ll/ۖ֫ܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۖ֫ܽ;)V
    .locals 3

    .line 904
    iget-object v0, p0, Ll/ۗ᩻ܽ;->ܿ:Ll/ۖ֫ܽ;

    invoke-virtual {v0, p1}, Ll/ۖ֫ܽ;->ۙ(Ll/ۖ֫ܽ;)Z

    move-result v1

    const-string v2, "Cannot add range %s to subRangeSet(%s)"

    .line 903
    invoke-static {v1, v2, p1, v0}, Ll/ۨۙܽ;->ۙ(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 908
    iget-object v0, p0, Ll/ۗ᩻ܽ;->֡:Ll/᩺᩻ܽ;

    invoke-virtual {v0, p1}, Ll/᩺᩻ܽ;->ۙ(Ll/ۖ֫ܽ;)V

    return-void
.end method

.method public final ᩷(Ll/ۖ֫ܽ;)Ll/ۜ֫ܽ;
    .locals 2

    .line 930
    iget-object v0, p0, Ll/ۗ᩻ܽ;->ܿ:Ll/ۖ֫ܽ;

    invoke-virtual {p1, v0}, Ll/ۖ֫ܽ;->ۙ(Ll/ۖ֫ܽ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 932
    :cond_0
    invoke-virtual {p1, v0}, Ll/ۖ֫ܽ;->ۤ(Ll/ۖ֫ܽ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 933
    new-instance v1, Ll/ۗ᩻ܽ;

    invoke-virtual {v0, p1}, Ll/ۖ֫ܽ;->᩷(Ll/ۖ֫ܽ;)Ll/ۖ֫ܽ;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Ll/ۗ᩻ܽ;-><init>(Ll/᩺᩻ܽ;Ll/ۖ֫ܽ;)V

    return-object v1

    .line 935
    :cond_1
    invoke-static {}, Ll/֨۫ܽ;->ۤ()Ll/֨۫ܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ljava/lang/Integer;)Z
    .locals 1

    .line 920
    iget-object v0, p0, Ll/ۗ᩻ܽ;->ܿ:Ll/ۖ֫ܽ;

    invoke-virtual {v0, p1}, Ll/ۖ֫ܽ;->ۙ(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ᩻ܽ;->֡:Ll/᩺᩻ܽ;

    invoke-virtual {v0, p1}, Ll/᩺᩻ܽ;->᩷(Ljava/lang/Integer;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
