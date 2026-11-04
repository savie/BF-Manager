.class public final synthetic Ll/ܽ֨֫;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/۬֨ᩴ;

.field public final synthetic ܿ:Landroid/os/Bundle;

.field public final synthetic ᩶:Ll/ۧۡ֫;


# direct methods
.method public synthetic constructor <init>(Ll/۬֨ᩴ;Ll/ۧۡ֫;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ֨֫;->ܰ:Ll/۬֨ᩴ;

    iput-object p2, p0, Ll/ܽ֨֫;->᩶:Ll/ۧۡ֫;

    iput-object p3, p0, Ll/ܽ֨֫;->ܿ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    sget v0, Ll/ۧۡ֫;->ۙۤ:I

    .line 353
    :try_start_0
    invoke-static {}, Ll/۟۠ۧ;->ܶ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    new-instance v0, Ll/ۖ᩶᩻;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܽ֨֫;->ܰ:Ll/۬֨ᩴ;

    iget-object v3, p0, Ll/ܽ֨֫;->᩶:Ll/ۧۡ֫;

    iget-object v4, p0, Ll/ܽ֨֫;->ܿ:Landroid/os/Bundle;

    invoke-direct {v0, v2, v3, v4, v1}, Ll/ۖ᩶᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    :catch_0
    move-exception v0

    .line 355
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
