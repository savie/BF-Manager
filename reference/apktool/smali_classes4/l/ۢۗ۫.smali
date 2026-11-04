.class public final synthetic Ll/ۢۗ۫;
.super Ljava/lang/Object;
.source "L8GV"

# interfaces
.implements Ll/ۖۗ۫;


# instance fields
.field public final synthetic ܰ:Ll/ᩳۛ۫;

.field public final synthetic ᩶:Ll/ۖۗܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۛ۫;Ll/ۖۗܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۗ۫;->ܰ:Ll/ᩳۛ۫;

    iput-object p2, p0, Ll/ۢۗ۫;->᩶:Ll/ۖۗܳ;

    return-void
.end method


# virtual methods
.method public final ۙ(J)Ljava/io/InputStream;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۢۗ۫;->ܰ:Ll/ᩳۛ۫;

    invoke-virtual {v0}, Ll/ᩳۛ۫;->֡()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 76
    iget-object v1, p0, Ll/ۢۗ۫;->᩶:Ll/ۖۗܳ;

    invoke-interface {v1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Ll/ᩳۛ۫;->ۙ(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method
