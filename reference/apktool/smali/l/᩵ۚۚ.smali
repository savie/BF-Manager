.class public final Ll/᩵ۚۚ;
.super Ljava/lang/Object;
.source "LIUC"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x90

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public static native ۙ(Ll/ۢ۫ۛ;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static ۙ(Ll/ۢ۫ۛ;ILjava/lang/String;)[B
    .locals 13

    .line 78
    new-instance v9, Ll/۠᩵ۛ;

    invoke-static {p1}, Ll/ᩴۜۨ;->᩷(I)Ll/ᩴۜۨ;

    move-result-object p1

    invoke-direct {v9, p1}, Ll/۠᩵ۛ;-><init>(Ll/ᩴۜۨ;)V

    if-nez p2, :cond_0

    .line 80
    invoke-virtual {v9, p0}, Ll/۠᩵ۛ;->ۙ(Ll/ۢ۫ۛ;)Ll/ۜ᩹ۛ;

    goto/16 :goto_1

    .line 83
    :cond_0
    invoke-interface {p0}, Ll/ۢ۫ۛ;->getMethods()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠۫ۛ;

    const/4 v1, 0x1

    .line 84
    invoke-static {v0, v1}, Ll/ܰܶۛ;->ۙ(Ll/ۙۧۛ;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 92
    invoke-interface {p0}, Ll/ᩴۧۛ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Ll/ۢ۫ۛ;->᩷()I

    move-result p2

    invoke-interface {p0}, Ll/ۢ۫ۛ;->֫ۤ()Ljava/lang/String;

    move-result-object v10

    .line 93
    invoke-interface {p0}, Ll/ۢ۫ۛ;->ܳۙ()Ljava/util/List;

    move-result-object v11

    invoke-interface {p0}, Ll/ۢ۫ۛ;->ۚ()Ljava/lang/String;

    move-result-object v12

    invoke-interface {p0}, Ll/ۢ۫ۛ;->getAnnotations()Ljava/util/Set;

    move-result-object p0

    .line 94
    invoke-interface {v0}, Ll/ۙۧۛ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ll/ۙۧۛ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 95
    invoke-interface {v0}, Ll/۠۫ۛ;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0}, Ll/ۙۧۛ;->ۤ()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Ll/۠۫ۛ;->᩷()I

    move-result v5

    .line 96
    invoke-interface {v0}, Ll/۠۫ۛ;->getAnnotations()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v0}, Ll/۠۫ۛ;->ۗ()Ljava/util/Set;

    move-result-object v7

    .line 97
    invoke-interface {v0}, Ll/۠۫ۛ;->֫᩷()Ll/ۜ۫ۛ;

    move-result-object v0

    invoke-virtual {v9, v0}, Ll/۠᩵ۛ;->ۙ(Ll/ۜ۫ۛ;)Ll/ۜ۫ۛ;

    move-result-object v8

    move-object v0, v9

    .line 94
    invoke-virtual/range {v0 .. v8}, Ll/۠᩵ۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/util/Set;Ljava/util/Set;Ll/ۜ۫ۛ;)Ll/ۙ᩵ۛ;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p1

    move v2, p2

    move-object v3, v10

    move-object v4, v11

    move-object v5, v12

    move-object v6, p0

    .line 92
    invoke-virtual/range {v0 .. v8}, Ll/۠᩵ۛ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Ljava/util/ArrayList;Ljava/util/Collection;)Ll/ۜ᩹ۛ;

    .line 99
    :goto_1
    new-instance p0, Ll/᩸ۨۛ;

    invoke-direct {p0}, Ll/᩸ۨۛ;-><init>()V

    .line 100
    invoke-virtual {v9, p0}, Ll/᩸᩹ۛ;->ۙ(Ll/۬᩵ۛ;)V

    .line 101
    invoke-virtual {p0}, Ll/᩸ۨۛ;->᩷()[B

    move-result-object p0

    return-object p0

    :cond_3
    const-string p0, "METHOD_NOT_FOUND"

    const-string p1, "Method not found."

    .line 90
    invoke-static {p0, p1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method
