.class public final Ll/᩶ܺ֫;
.super Ljava/lang/Object;
.source "OIRX"

# interfaces
.implements Ll/۠ۚ֫;


# instance fields
.field public final synthetic ܰ:Ll/۟ܺ֫;


# direct methods
.method public constructor <init>(Ll/۟ܺ֫;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܺ֫;->ܰ:Ll/۟ܺ֫;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final synthetic onPageSelected(I)V
    .locals 0

    return-void
.end method

.method public final synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(IJ)V
    .locals 0

    return-void
.end method

.method public final ۙ(Ll/۬ۚ֫;IJ)V
    .locals 2

    .line 132
    iget-object v0, p0, Ll/᩶ܺ֫;->ܰ:Ll/۟ܺ֫;

    invoke-static {v0}, Ll/۟ܺ֫;->᩷(Ll/۟ܺ֫;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 134
    new-instance v1, Ll/֡ܺ֫;

    invoke-static {v0}, Ll/۟ܺ֫;->᩷(Ll/۟ܺ֫;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֡ܺ֫;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, p2, p3, p4, v1}, Ll/۬ۚ֫;->ۙ(IJLl/ۙۧ֫;)Z

    :cond_0
    return-void
.end method

.method public final synthetic ۙ(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
