.class public final synthetic Ll/۠ۜᩴ;
.super Ljava/lang/Object;
.source "44R4"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ljava/util/function/IntSupplier;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ljava/util/function/IntSupplier;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۜᩴ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/۠ۜᩴ;->᩶:Ljava/util/function/IntSupplier;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/۠ۜᩴ;->ܰ:Ll/᩹ۖ᩸;

    iget-object v0, p0, Ll/۠ۜᩴ;->᩶:Ljava/util/function/IntSupplier;

    invoke-static {p1, v0, p2}, Ll/۬ۜᩴ;->ۙ(Ll/᩹ۖ᩸;Ljava/util/function/IntSupplier;Z)V

    return-void
.end method
