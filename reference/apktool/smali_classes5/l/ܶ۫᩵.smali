.class public final synthetic Ll/ܶ۫᩵;
.super Ljava/lang/Object;
.source "B6I6"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:Ll/ۗۖۗ;

.field public final synthetic ܿ:Ljava/util/Map;

.field public final synthetic ᩶:Ll/֫֨ۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۖۗ;Ll/֫֨ۗ;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۫᩵;->ܰ:Ll/ۗۖۗ;

    iput-object p2, p0, Ll/ܶ۫᩵;->᩶:Ll/֫֨ۗ;

    iput-object p3, p0, Ll/ܶ۫᩵;->ܿ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ܶ۫᩵;->᩶:Ll/֫֨ۗ;

    .line 4
    iget-object v1, p0, Ll/ܶ۫᩵;->ܿ:Ljava/util/Map;

    .line 444
    iget-object v2, p0, Ll/ܶ۫᩵;->ܰ:Ll/ۗۖۗ;

    invoke-virtual {v2, v0, v1}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;Ljava/util/Map;)Ll/֫֨ۗ;

    move-result-object v0

    return-object v0
.end method
