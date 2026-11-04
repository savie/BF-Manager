.class public final synthetic Ll/ۖۘۚ;
.super Ljava/lang/Object;
.source "W6X3"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/᩻ܶ᩵;


# direct methods
.method public static bridge synthetic ۙ(Landroid/graphics/Insets;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/graphics/Insets;->left:I

    return p0
.end method

.method public static synthetic ᩷(Ljava/lang/String;)Ll/ܽܺۗ;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->chars()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܺۗ;->convert(Ljava/util/stream/IntStream;)Ll/ܽܺۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 0
    check-cast p1, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;

    invoke-virtual {p1}, Lbin/mt/plugin/api/ui/dialog/BaseCancelableDialog;->dismiss()V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    sget v0, Ll/֨֫ۧ;->ۡ᩷:I

    .line 1193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 786
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Ll/᩷ۨᩴ;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 16
    invoke-static {p1, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    return-object p1
.end method
