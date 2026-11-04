.class public final synthetic Ll/ۨۘۤ;
.super Ljava/lang/Object;
.source "MB7O"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۡۚ᩸;

.field public final synthetic ᩶:Ll/۠ۨܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۚ᩸;Ll/۠ۨܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۘۤ;->ܰ:Ll/ۡۚ᩸;

    iput-object p2, p0, Ll/ۨۘۤ;->᩶:Ll/۠ۨܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 255
    iget-object p1, p0, Ll/ۨۘۤ;->ܰ:Ll/ۡۚ᩸;

    invoke-virtual {p1}, Ll/ۡۚ᩸;->ۙ()V

    .line 256
    iget-object p2, p1, Ll/ۡۚ᩸;->ۙ:Ll/᩷ۨᩴ;

    iget-object p1, p1, Ll/ۡۚ᩸;->᩷:Ll/᩷ۨᩴ;

    const v0, 0x7f120773

    const-string v1, "mtcr"

    .line 50
    iget-object v2, p0, Ll/ۨۘۤ;->᩶:Ll/۠ۨܳ;

    invoke-static {v2, v0, v1}, Ll/۬֡ܳ;->ۙ(Ll/۠ۨܳ;ILjava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 51
    sget v1, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance v1, Ll/۠ۜۧ;

    const-class v2, Ll/ܰۘۤ;

    invoke-direct {v1, v2}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    const-string v2, "saveAsPath"

    .line 52
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "inputPath1"

    .line 53
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, v0, p2}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "inputPath2"

    .line 54
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1}, Ll/۠ۜۧ;->ۙ()I

    return-void
.end method
