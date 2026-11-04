.class public final Ll/֫֨᩸;
.super Ll/ۢ᩶᩸;
.source "P7QH"


# instance fields
.field public final synthetic ᩳ:Ll/᩻֨᩸;


# direct methods
.method public constructor <init>(Ll/᩻֨᩸;Ll/ᩳ۬᩸;)V
    .locals 0

    .line 228
    iput-object p1, p0, Ll/֫֨᩸;->ᩳ:Ll/᩻֨᩸;

    invoke-direct {p0, p2}, Ll/ۢ᩶᩸;-><init>(Landroid/text/Editable;)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 231
    iget-object v0, p0, Ll/֫֨᩸;->ᩳ:Ll/᩻֨᩸;

    invoke-static {v0}, Ll/᩻֨᩸;->ۙ(Ll/᩻֨᩸;)Ll/᩺ۜ᩸;

    move-result-object v1

    .line 10117
    iget-boolean v1, v1, Ll/᩺ۜ᩸;->ۚ᩷:Z

    if-nez v1, :cond_1

    .line 233
    invoke-static {v0}, Ll/᩻֨᩸;->᩷(Ll/᩻֨᩸;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll/ۢ᩶᩸;->᩸()J

    move-result-wide v1

    const-wide/16 v3, 0x1000

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    goto :goto_0

    .line 234
    :cond_0
    invoke-static {v0}, Ll/᩻֨᩸;->ۙ(Ll/᩻֨᩸;)Ll/᩺ۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۧ᩸()V

    :cond_1
    :goto_0
    return-void
.end method
