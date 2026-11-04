.class public final synthetic Ll/ܶۜܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ܰ:Ll/᩸۬ܳ;

.field public final synthetic ᩶:Ll/ᩴܿ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۬ܳ;Ll/ᩴܿ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۜܳ;->ܰ:Ll/᩸۬ܳ;

    iput-object p2, p0, Ll/ܶۜܳ;->᩶:Ll/ᩴܿ᩻;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ܶۜܳ;->᩶:Ll/ᩴܿ᩻;

    .line 729
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result p1

    iget-object v0, p0, Ll/ܶۜܳ;->ܰ:Ll/᩸۬ܳ;

    iput p1, v0, Ll/᩸۬ܳ;->᩷:I

    return-void
.end method
