.class public final Ll/ۛۨܽ;
.super Ljava/lang/Object;
.source "W8AM"

# interfaces
.implements Ll/᩸ۛܽ;


# instance fields
.field public final ܰ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 414
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 415
    iput-object p1, p0, Ll/ۛۨܽ;->ܰ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final construct()Ljava/lang/Object;
    .locals 2

    .line 424
    new-instance v0, Ll/۟᩵ܽ;

    iget-object v1, p0, Ll/ۛۨܽ;->ܰ:Ljava/lang/String;

    .line 42
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 424
    throw v0
.end method
