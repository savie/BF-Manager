.class public final synthetic Ll/ܶ᩶᩸;
.super Ljava/lang/Object;
.source "Q92M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/᩹᩶᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹᩶᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩶᩸;->ܰ:Ll/᩹᩶᩸;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܶ᩶᩸;->ܰ:Ll/᩹᩶᩸;

    .line 51
    iget-boolean v0, v0, Ll/᩹᩶᩸;->ܳ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Text statistics canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
