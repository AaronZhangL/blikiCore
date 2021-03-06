package info.bliki.extensions.scribunto.interfaces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MwUriTest extends LuaTestBase {
    @Override
    public String getLuaTest() {
        return "UriLibraryTests.lua";
    }

    @Override
    public Set<String> ignoredTests() {
        return new HashSet<>(Arrays.asList("uri.anchorEncode"));
    }
}
