.class public final synthetic Ll/ᩳۢ֫;
.super Ljava/lang/Object;
.source "350S"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳۢ֫;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/ᩳۢ֫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩷ۡۗ;

    .line 10
    invoke-virtual {p1}, Ll/᩷ۡۗ;->۠()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Ll/ܺ֨ۗ;

    .line 17
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object p1

    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, Ll/ۛۡۗ;

    .line 24
    invoke-interface {p1}, Ll/ۛۡۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 28
    :pswitch_2
    check-cast p1, Ll/ܽۘۗ;

    .line 37
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    return-object p1

    .line 0
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    const-string v0, "ecdsa-sha2-"

    invoke-static {v0, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$rbJqeMelTsvtQF6pdGncRrWVLuQ(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$S2IvI5mz57Vr0X9iK-ZsujxhqK4(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {p1}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$et6DsGluOAw8S_D3be4S0UzPkbA(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ll/ۖۗܳ;

    .line 64
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :pswitch_8
    check-cast p1, Ll/᩹ᩴۤ;

    invoke-static {p1}, Ll/᩻ᩴۤ;->ۙ(Ll/᩹ᩴۤ;)Ll/᩵ܺۗ;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lbin/mt/plus/Features;->ۙ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
