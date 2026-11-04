.class public final Ll/ۜ᩺ܽ;
.super Ll/ܽۨܽ;
.source "K84H"


# instance fields
.field public final ۙ:Ll/᩺᩵ܽ;

.field public final ۤ:Ljava/lang/reflect/Type;

.field public final ᩷:Ll/ܽۨܽ;


# direct methods
.method public constructor <init>(Ll/᩺᩵ܽ;Ll/ܽۨܽ;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۜ᩺ܽ;->ۙ:Ll/᩺᩵ܽ;

    .line 35
    iput-object p2, p0, Ll/ۜ᩺ܽ;->᩷:Ll/ܽۨܽ;

    .line 36
    iput-object p3, p0, Ll/ۜ᩺ܽ;->ۤ:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۜ᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {v0, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 4

    .line 104
    iget-object v0, p0, Ll/ۜ᩺ܽ;->ۤ:Ljava/lang/reflect/Type;

    if-nez p2, :cond_0

    goto :goto_1

    .line 113
    :cond_0
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_1

    .line 114
    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/WildcardType;

    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    goto :goto_0

    :cond_1
    move-object v1, v0

    .line 117
    :goto_0
    instance-of v2, v1, Ljava/lang/Class;

    if-nez v2, :cond_3

    instance-of v1, v1, Ljava/lang/reflect/TypeVariable;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v1, v0

    goto :goto_3

    .line 118
    :cond_3
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 57
    :goto_3
    iget-object v2, p0, Ll/ۜ᩺ܽ;->᩷:Ll/ܽۨܽ;

    if-eq v1, v0, :cond_8

    .line 60
    iget-object v0, p0, Ll/ۜ᩺ܽ;->ۙ:Ll/᩺᩵ܽ;

    .line 61
    invoke-static {v1}, Ll/ۛܰܽ;->ۙ(Ljava/lang/reflect/Type;)Ll/ۛܰܽ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v0

    .line 65
    instance-of v1, v0, Ll/ܿ᩺ܽ;

    if-nez v1, :cond_4

    goto :goto_6

    :cond_4
    move-object v1, v2

    .line 87
    :goto_4
    instance-of v3, v1, Ll/ۡ᩺ܽ;

    if-eqz v3, :cond_6

    .line 88
    move-object v3, v1

    check-cast v3, Ll/ۡ᩺ܽ;

    .line 89
    invoke-virtual {v3}, Ll/ۡ᩺ܽ;->᩷()Ll/ܽۨܽ;

    move-result-object v3

    if-ne v3, v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v3

    goto :goto_4

    .line 99
    :cond_6
    :goto_5
    instance-of v1, v1, Ll/ܿ᩺ܽ;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object v2, v0

    .line 77
    :cond_8
    :goto_7
    invoke-virtual {v2, p1, p2}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    return-void
.end method
