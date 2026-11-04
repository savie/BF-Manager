.class public final synthetic Ll/ᩳۛ᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/۟ܰ᩸;

.field public final synthetic ܿ:J

.field public final synthetic ᩶:Ll/ۖܰ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܰ᩸;Ll/ۖܰ᩸;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۛ᩸;->ܰ:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/ᩳۛ᩸;->᩶:Ll/ۖܰ᩸;

    iput-wide p3, p0, Ll/ᩳۛ᩸;->ܿ:J

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 699
    iget-object p1, p0, Ll/ᩳۛ᩸;->ܰ:Ll/۟ܰ᩸;

    invoke-virtual {p1}, Ll/ۜܽ᩸;->ۚ()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 401
    invoke-virtual {p1}, Ll/ۧ۫ۙ;->requireActivity()Ll/ۗ۫ۙ;

    move-result-object p2

    check-cast p2, Ll/ܿۛ᩸;

    .line 700
    invoke-virtual {p2}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p2

    const v1, 0x7f120d44

    .line 701
    invoke-virtual {p2, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v1, 0x7f1201f1

    .line 702
    invoke-virtual {p2, v1}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v1, Ll/᩵᩺᩸;

    invoke-direct {v1, p1}, Ll/᩵᩺᩸;-><init>(Ll/۟ܰ᩸;)V

    const v2, 0x7f1208c9

    .line 703
    invoke-virtual {p2, v2, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۨ᩺᩸;

    iget-object v2, p0, Ll/ᩳۛ᩸;->᩶:Ll/ۖܰ᩸;

    iget-wide v3, p0, Ll/ᩳۛ᩸;->ܿ:J

    invoke-direct {v1, p1, v2, v3, v4}, Ll/ۨ᩺᩸;-><init>(Ll/۟ܰ᩸;Ll/ۖܰ᩸;J)V

    const p1, 0x7f120161

    .line 706
    invoke-virtual {p2, p1, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 709
    invoke-virtual {p2, v0}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 710
    invoke-virtual {p2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    :cond_0
    const/4 p2, -0x1

    const/4 v1, 0x1

    .line 712
    invoke-virtual {p1, p2, v0, v1}, Ll/۟ܰ᩸;->ۙ(IZZ)V

    return-void
.end method
