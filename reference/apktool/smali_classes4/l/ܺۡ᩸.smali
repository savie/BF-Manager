.class public final synthetic Ll/ܺۡ᩸;
.super Ljava/lang/Object;
.source "V8VP"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/᩺ۜ᩸;

.field public final synthetic ۟:Z

.field public final synthetic ۢ:Ll/᩺ۜ᩸;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ll/ۗ۬᩸;

.field public final synthetic ᩳ:Ll/ۗ۬᩸;

.field public final synthetic ᩶:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(I[Ljava/lang/String;Ll/ۗ۬᩸;Ll/᩺ۜ᩸;ZLl/ۗ۬᩸;Ll/᩺ۜ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܺۡ᩸;->ܰ:I

    iput-object p2, p0, Ll/ܺۡ᩸;->᩶:[Ljava/lang/String;

    iput-object p3, p0, Ll/ܺۡ᩸;->ܿ:Ll/ۗ۬᩸;

    iput-object p4, p0, Ll/ܺۡ᩸;->֡:Ll/᩺ۜ᩸;

    iput-boolean p5, p0, Ll/ܺۡ᩸;->۟:Z

    iput-object p6, p0, Ll/ܺۡ᩸;->ᩳ:Ll/ۗ۬᩸;

    iput-object p7, p0, Ll/ܺۡ᩸;->ۢ:Ll/᩺ۜ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 620
    iget v0, p0, Ll/ܺۡ᩸;->ܰ:I

    if-eq v0, p2, :cond_2

    .line 621
    iget-object v0, p0, Ll/ܺۡ᩸;->᩶:[Ljava/lang/String;

    aget-object p2, v0, p2

    .line 622
    iget-object v0, p0, Ll/ܺۡ᩸;->ܿ:Ll/ۗ۬᩸;

    invoke-virtual {v0, p2}, Ll/ۗ۬᩸;->᩷(Ljava/lang/String;)V

    .line 623
    invoke-static {}, Ll/ۗ۬᩸;->ܶ()Z

    move-result v0

    iget-object v1, p0, Ll/ܺۡ᩸;->֡:Ll/᩺ۜ᩸;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2119
    invoke-virtual {v1, p2, v2}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    .line 626
    :cond_0
    invoke-virtual {v1, p2}, Ll/᩺ۜ᩸;->᩷(Ljava/lang/String;)V

    .line 627
    iget-boolean v0, p0, Ll/ܺۡ᩸;->۟:Z

    if-eqz v0, :cond_2

    .line 628
    iget-object v0, p0, Ll/ܺۡ᩸;->ᩳ:Ll/ۗ۬᩸;

    invoke-virtual {v0, p2}, Ll/ۗ۬᩸;->᩷(Ljava/lang/String;)V

    .line 629
    invoke-static {}, Ll/ۗ۬᩸;->ܶ()Z

    move-result v0

    iget-object v1, p0, Ll/ܺۡ᩸;->ۢ:Ll/᩺ۜ᩸;

    if-eqz v0, :cond_1

    .line 2119
    invoke-virtual {v1, p2, v2}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    .line 632
    :cond_1
    invoke-virtual {v1, p2}, Ll/᩺ۜ᩸;->᩷(Ljava/lang/String;)V

    .line 635
    :cond_2
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
