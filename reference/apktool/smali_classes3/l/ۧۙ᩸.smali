.class public final synthetic Ll/ۧۙ᩸;
.super Ljava/lang/Object;
.source "B9R5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/᩺ۙ᩸;

.field public final synthetic ܰ:[Z

.field public final synthetic ܿ:Ll/᩺ۙ᩸;

.field public final synthetic ᩶:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>([ZLl/۠ۖۧ;Ll/᩺ۙ᩸;Ll/᩺ۙ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۙ᩸;->ܰ:[Z

    iput-object p2, p0, Ll/ۧۙ᩸;->᩶:Ll/۠ۖۧ;

    iput-object p3, p0, Ll/ۧۙ᩸;->ܿ:Ll/᩺ۙ᩸;

    iput-object p4, p0, Ll/ۧۙ᩸;->֡:Ll/᩺ۙ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 2
    sget p1, Ll/ۛۙ᩸;->ܺ᩷:I

    .line 495
    iget-object p1, p0, Ll/ۧۙ᩸;->ܰ:[Z

    const/4 v0, 0x0

    aget-boolean v1, p1, v0

    xor-int/lit8 v2, v1, 0x1

    aput-boolean v2, p1, v0

    .line 496
    iget-object p1, p0, Ll/ۧۙ᩸;->᩶:Ll/۠ۖۧ;

    iget-object v0, p0, Ll/ۧۙ᩸;->ܿ:Ll/᩺ۙ᩸;

    iget-object v2, p0, Ll/ۧۙ᩸;->֡:Ll/᩺ۙ᩸;

    const-string v3, " > "

    if-nez v1, :cond_0

    .line 497
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 499
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method
