.class public final Ll/ۡۨۨ;
.super Ljava/lang/Object;
.source "X6CH"


# static fields
.field public static final ۙ:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 94
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    sput-object v0, Ll/ۡۨۨ;->ۙ:Ljava/util/Set;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/util/function/Function;)Ll/ۚܺۗ;
    .locals 7

    .line 210
    new-instance v6, Ll/֨ۨۨ;

    new-instance v1, Ll/۟ۨۨ;

    invoke-direct {v1, p0}, Ll/۟ۨۨ;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Ll/ᩳۨۨ;

    invoke-direct {v2, p1}, Ll/ᩳۨۨ;-><init>(Ljava/util/function/Function;)V

    new-instance v3, Ll/ۢۨۨ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ll/᩹֡ۗ;

    const/4 p0, 0x7

    invoke-direct {v4, p0}, Ll/᩹֡ۗ;-><init>(I)V

    sget-object v5, Ll/ۡۨۨ;->ۙ:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/֨ۨۨ;-><init>(Ll/۟ۨۨ;Ll/ᩳۨۨ;Ll/ۢۨۨ;Ll/᩹֡ۗ;Ljava/util/Set;)V

    return-object v6
.end method
