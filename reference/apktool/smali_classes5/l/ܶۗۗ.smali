.class public final synthetic Ll/ܶۗۗ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/BiFunction;
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ll/ܶۗۗ;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/function/Function;I)V
    .locals 0

    iput p2, p0, Ll/ܶۗۗ;->a:I

    iput-object p1, p0, Ll/ܶۗۗ;->b:Ljava/util/function/Function;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    invoke-static {p0, p1}, Ll/ۗۧۗ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 1

    iget v0, p0, Ll/ܶۗۗ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll/ܶۗۗ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 81
    iget-object v0, p0, Ll/ܶۗۗ;->b:Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܶۗۗ;->b:Ljava/util/function/Function;

    check-cast p1, Ljava/util/Map;

    sget-object v1, Ll/֫ܺۗ;->a:Ljava/util/Set;

    .line 1142
    new-instance v1, Ll/ܶۗۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/ܶۗۗ;-><init>(Ljava/util/function/Function;I)V

    invoke-static {p1, v1}, Ll/ۧۚۗ;->replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-object p1

    .line 46
    :cond_0
    instance-of v1, p1, Ll/᩵ܺۗ;

    if-eqz v1, :cond_1

    .line 47
    check-cast p1, Ll/᩵ܺۗ;

    invoke-static {p1}, Ll/ۗܺۗ;->convert(Ll/᩵ܺۗ;)Ljava/util/stream/Stream;

    move-result-object v0

    goto :goto_0

    .line 49
    :cond_1
    instance-of v1, p1, Ljava/util/stream/Stream;

    if-eqz v1, :cond_2

    .line 50
    check-cast p1, Ljava/util/stream/Stream;

    invoke-static {p1}, Ll/ܿܶۗ;->b(Ljava/util/stream/Stream;)Ll/᩵ܺۗ;

    move-result-object v0

    goto :goto_0

    .line 53
    :cond_2
    instance-of v1, p1, Ll/ܽܺۗ;

    if-eqz v1, :cond_3

    .line 54
    check-cast p1, Ll/ܽܺۗ;

    invoke-static {p1}, Ll/ܺܺۗ;->convert(Ll/ܽܺۗ;)Ljava/util/stream/IntStream;

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_3
    instance-of v1, p1, Ljava/util/stream/IntStream;

    if-eqz v1, :cond_4

    .line 57
    check-cast p1, Ljava/util/stream/IntStream;

    invoke-static {p1}, Ll/᩻ܺۗ;->convert(Ljava/util/stream/IntStream;)Ll/ܽܺۗ;

    move-result-object v0

    goto :goto_0

    .line 60
    :cond_4
    instance-of v1, p1, Ll/᩵ܶۗ;

    if-eqz v1, :cond_5

    .line 61
    check-cast p1, Ll/᩵ܶۗ;

    .line 62
    invoke-static {p1}, Ll/ܳܶۗ;->b(Ll/᩵ܶۗ;)Ljava/util/stream/DoubleStream;

    move-result-object v0

    goto :goto_0

    .line 64
    :cond_5
    instance-of v1, p1, Ljava/util/stream/DoubleStream;

    if-eqz v1, :cond_6

    .line 65
    check-cast p1, Ljava/util/stream/DoubleStream;

    .line 66
    invoke-static {p1}, Ll/֨ܽۗ;->b(Ljava/util/stream/DoubleStream;)Ll/᩵ܶۗ;

    move-result-object v0

    goto :goto_0

    .line 69
    :cond_6
    instance-of v1, p1, Ll/ܶܺۗ;

    if-eqz v1, :cond_7

    .line 70
    check-cast p1, Ll/ܶܺۗ;

    .line 71
    invoke-static {p1}, Ll/᩸᩵ۗ;->b(Ll/ܶܺۗ;)Ljava/util/stream/LongStream;

    move-result-object v0

    goto :goto_0

    .line 73
    :cond_7
    instance-of v1, p1, Ljava/util/stream/LongStream;

    if-eqz v1, :cond_8

    .line 74
    check-cast p1, Ljava/util/stream/LongStream;

    invoke-static {p1}, Ll/ᩳۗۗ;->b(Ljava/util/stream/LongStream;)Ll/ܶܺۗ;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_8
    const-string v1, "java.util.stream.*Stream"

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܶۧۗ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Ll/ܶۗۗ;->b:Ljava/util/function/Function;

    sget-object v0, Ll/֫ܺۗ;->a:Ljava/util/Set;

    .line 1142
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 1

    iget v0, p0, Ll/ܶۗۗ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩺ۧۗ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
