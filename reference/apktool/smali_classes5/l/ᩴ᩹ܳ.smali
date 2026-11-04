.class public final Ll/ᩴ᩹ܳ;
.super Ljava/lang/Object;
.source "YIWY"


# instance fields
.field public final ۙ:Ljava/util/Map;

.field public final ᩷:I


# direct methods
.method public constructor <init>(Ll/᩻᩹ܳ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iget v0, p1, Ll/᩻᩹ܳ;->᩷:I

    iput v0, p0, Ll/ᩴ᩹ܳ;->᩷:I

    .line 22
    iget-object p1, p1, Ll/᩻᩹ܳ;->ۙ:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    return-void
.end method
