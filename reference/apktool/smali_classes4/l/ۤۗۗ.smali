.class public final synthetic Ll/ۤۗۗ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/function/Function;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Function;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Ll/ۤۗۗ;->a:I

    iput-object p1, p0, Ll/ۤۗۗ;->b:Ljava/util/function/Function;

    iput-object p2, p0, Ll/ۤۗۗ;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۤۗۗ;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Ll/ۤۗۗ;->a:I

    iget-object v1, p0, Ll/ۤۗۗ;->d:Ljava/lang/Object;

    iget-object v2, p0, Ll/ۤۗۗ;->c:Ljava/lang/Object;

    iget-object v3, p0, Ll/ۤۗۗ;->b:Ljava/util/function/Function;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Ljava/util/function/Supplier;

    check-cast v1, Ljava/util/function/BiConsumer;

    check-cast p1, Ljava/util/Map;

    sget-object v0, Ll/֫ܺۗ;->a:Ljava/util/Set;

    .line 1127
    invoke-interface {v3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "element cannot be mapped to a null key"

    invoke-static {v0, v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1128
    new-instance v3, Ll/ۗۜ᩹;

    const/16 v4, 0xa

    invoke-direct {v3, v4, v2}, Ll/ۗۜ᩹;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0, v3}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    .line 1129
    invoke-interface {v1, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v2, Ljava/util/function/Function;

    check-cast v1, Ljava/util/function/BinaryOperator;

    check-cast p1, Ljava/util/Map;

    sget-object v0, Ll/֫ܺۗ;->a:Ljava/util/Set;

    .line 1658
    invoke-interface {v3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1659
    invoke-interface {v2, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 1658
    invoke-static {p1, v0, p2, v1}, Ll/ۧۚۗ;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 1

    iget v0, p0, Ll/ۤۗۗ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
