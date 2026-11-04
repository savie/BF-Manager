.class public final Ll/ۗۗ;
.super Ljava/util/AbstractSet;
.source "J5WP"


# instance fields
.field public final synthetic ܰ:Ll/ܰۗ;


# direct methods
.method public constructor <init>(Ll/ܰۗ;)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ۗۗ;->ܰ:Ll/ܰۗ;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 262
    new-instance v0, Ll/ۛۗ;

    iget-object v1, p0, Ll/ۗۗ;->ܰ:Ll/ܰۗ;

    invoke-direct {v0, v1}, Ll/ۛۗ;-><init>(Ll/ܰۗ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 267
    iget-object v0, p0, Ll/ۗۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v0

    return v0
.end method
