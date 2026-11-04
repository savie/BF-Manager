.class public final Ll/ۚܰۗ;
.super Ll/ܺ۠ۗ;
.source "HIUL"


# static fields
.field public static final ᩶:Ll/᩻ܽ᩺;


# instance fields
.field public final ܰ:Ll/ۨܿۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 13
    const-class v0, Ll/ۚܰۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۚܰۗ;->᩶:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۨܿۗ;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ۚܰۗ;->ܰ:Ll/ۨܿۗ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۚܰۗ;->ܰ:Ll/ۨܿۗ;

    invoke-interface {v0}, Ll/ܽܿۗ;->ۤ()Ll/ܶܿۗ;

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 2

    .line 29
    :try_start_0
    iget-object p1, p0, Ll/ۚܰۗ;->ܰ:Ll/ۨܿۗ;

    invoke-interface {p1}, Ll/ۨܿۗ;->ۙ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 31
    sget-object v0, Ll/ۚܰۗ;->᩶:Ll/᩻ܽ᩺;

    const-string v1, "Error in prepare pass init: {}"

    invoke-interface {v0, v1, p0, p1}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
