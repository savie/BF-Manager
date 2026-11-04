.class public final Ll/ۗ᩶;
.super Ljava/lang/Object;
.source "U5Z7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static ۜۨ᩺:Z


# instance fields
.field public final synthetic ܰ:Landroid/app/Activity;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:[Ljava/lang/String;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/app/Activity;[Ljava/lang/String;I)V
    .locals 0

    .line 548
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۗ᩶;->᩶:[Ljava/lang/String;

    iput-object p1, p0, Ll/ۗ᩶;->ܰ:Landroid/app/Activity;

    iput p3, p0, Ll/ۗ᩶;->ܿ:I

    return-void
.end method

.method public static ۘ᩸ۘ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ۘ᩻۬(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۛܶᩴ(Ljava/lang/Object;)Ll/ۢܳۚ;
    .locals 0

    check-cast p0, Ljava/lang/Exception;

    invoke-static {p0}, Ll/ܿۧۚ;->ۙ(Ljava/lang/Exception;)Ll/ۢܳۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۛ᩹ᩳ(ILjava/lang/Object;)C
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result p0

    return p0
.end method

.method public static ۟ᩳ۫(ILjava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    invoke-static {p0, p1}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result p0

    return p0
.end method

.method public static ۠᩷ܽ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ֡ۜ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۖۖۧ;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۧ۟۠(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۨܽ᩷(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/᩷ۨᩴ;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܰ᩻ܺ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/᩻ܽܺ;

    invoke-virtual {p0, p1}, Ll/᩻ܽܺ;->᩷(I)V

    return-void
.end method

.method public static ܳۛۘ(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ܳܶۢ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ᩻ۤ(Ljava/lang/Object;I)J
    .locals 0

    check-cast p0, Ll/ܳ֨᩻;

    invoke-virtual {p0, p1}, Ll/ܳ֨᩻;->᩷(I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ᩶ۚۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩺ᩴܳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 551
    iget-object v0, p0, Ll/ۗ᩶;->᩶:[Ljava/lang/String;

    array-length v1, v0

    new-array v1, v1, [I

    .line 553
    iget-object v2, p0, Ll/ۗ᩶;->ܰ:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 554
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 556
    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    .line 558
    aget-object v7, v0, v6

    invoke-virtual {v3, v7, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    aput v7, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 562
    :cond_0
    check-cast v2, Ll/᩺᩶;

    iget v3, p0, Ll/ۗ᩶;->ܿ:I

    invoke-interface {v2, v3, v0, v1}, Ll/᩺᩶;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method
