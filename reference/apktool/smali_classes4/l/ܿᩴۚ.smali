.class public final Ll/ܿᩴۚ;
.super Ljava/lang/Object;
.source "26HN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۡᩴۚ;


# direct methods
.method public constructor <init>(Ll/ۡᩴۚ;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩴۚ;->ܰ:Ll/ۡᩴۚ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 111
    iget-object v0, p0, Ll/ܿᩴۚ;->ܰ:Ll/ۡᩴۚ;

    invoke-static {v0}, Ll/ۡᩴۚ;->ۚ(Ll/ۡᩴۚ;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 112
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const/4 v3, 0x0

    .line 113
    :goto_0
    invoke-static {v0}, Ll/ۡᩴۚ;->۫(Ll/ۡᩴۚ;)Ll/ۚܿ᩻;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 114
    invoke-static {v0}, Ll/ۡᩴۚ;->۫(Ll/ۡᩴۚ;)Ll/ۚܿ᩻;

    move-result-object v4

    invoke-static {v0}, Ll/ۡᩴۚ;->۫(Ll/ۡᩴۚ;)Ll/ۚܿ᩻;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩻ᩳ᩷;->getChildViewHolder(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v4

    check-cast v4, Ll/֨ᩴۚ;

    .line 115
    iget-object v5, v4, Ll/֨ᩴۚ;->۫:Ll/۬᩷ۚ;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ll/۬᩷ۚ;->ۙ()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, v1, v2}, Ll/֨ᩴۚ;->ۙ(J)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 117
    :cond_2
    invoke-static {v0}, Ll/ۡᩴۚ;->ܳ(Ll/ۡᩴۚ;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
