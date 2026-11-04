.class public final synthetic Ll/ܰۚܳ;
.super Ljava/lang/Object;
.source "R6KO"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/ۧ֫᩵;

.field public final synthetic ܰ:Z

.field public final synthetic ܿ:Ll/۟֫ܳ;

.field public final synthetic ᩶:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(ZLandroid/widget/Spinner;Ll/۟֫ܳ;Ll/ۧ֫᩵;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ܰۚܳ;->ܰ:Z

    iput-object p2, p0, Ll/ܰۚܳ;->᩶:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ܰۚܳ;->ܿ:Ll/۟֫ܳ;

    iput-object p4, p0, Ll/ܰۚܳ;->֡:Ll/ۧ֫᩵;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 127
    iget-object p1, p0, Ll/ܰۚܳ;->᩶:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    iget-boolean p2, p0, Ll/ܰۚܳ;->ܰ:Z

    invoke-static {p1, p2}, Ll/ܳ᩻ܳ;->ۙ(IZ)V

    .line 128
    iget-object p1, p0, Ll/ܰۚܳ;->ܿ:Ll/۟֫ܳ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/۟֫ܳ;->ۙ()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/ܰۚܳ;->֡:Ll/ۧ֫᩵;

    invoke-virtual {p2, p1}, Ll/ۧ֫᩵;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
