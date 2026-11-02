.class public final Ll/ۗܺ;
.super Ljava/lang/Object;
.source "S6AR"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# static fields
.field public static ۨ᩺۠:I


# instance fields
.field public final synthetic ܺ:Ll/ۖ᩶;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Ll/ۖ᩶;)V
    .locals 0

    .line 2020
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗܺ;->ܺ:Ll/ۖ᩶;

    return-void
.end method

.method public static ֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫ᩴ۬(Ljava/lang/Object;)Landroid/text/Editable;
    .locals 0

    check-cast p0, Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    return-object p0
.end method

.method public static ۖۗܺ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۘܺۨ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۚ᩸ۘ;

    invoke-interface {p0}, Ll/ۚ᩸ۘ;->֨()Z

    move-result p0

    return p0
.end method

.method public static ۜܰ᩸(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۚ֨ۘ;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ۚ֨ۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ۤ᩵᩸(Ljava/lang/Object;J)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ۬ۨܰ([SIII)Ljava/lang/String;
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

.method public static ܰۡ֨(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    return p0
.end method

.method public static ܶܳۘ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-virtual {p0}, Ll/᩷۠ۚ;->᩻()V

    return-void
.end method

.method public static ᩳۗۚ(Ljava/lang/Object;I)Landroid/view/View;
    .locals 0

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴۡܺ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static ᩴۤ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ᩵֫ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩹᩶᩵(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-virtual {p0}, Ll/᩷۠ۚ;->۟ۙ()Z

    move-result p0

    return p0
.end method

.method public static ᩻֡ۗ(J)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻᩷ܶ(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 2

    .line 2023
    iget-object v0, p0, Ll/ۗܺ;->ܺ:Ll/ۖ᩶;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۖ᩶;->onChildViewsChanged(I)V

    const/4 v0, 0x1

    return v0
.end method
