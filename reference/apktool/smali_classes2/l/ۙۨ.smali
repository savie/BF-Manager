.class public final Ll/ۙۨ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/֨ۨ;


# direct methods
.method public constructor <init>(Ll/֨ۨ;)V
    .locals 0

    .line 690
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۨ;->ܺ:Ll/֨ۨ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 698
    :try_start_0
    iget-object v0, p0, Ll/ۙۨ;->ܺ:Ll/֨ۨ;

    invoke-static {v0}, Ll/֨ۨ;->ۨ(Ll/֨ۨ;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 705
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 709
    :cond_0
    throw v0

    :catch_1
    move-exception v0

    .line 700
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Can not perform this action after onSaveInstanceState"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    return-void

    .line 702
    :cond_1
    throw v0
.end method
